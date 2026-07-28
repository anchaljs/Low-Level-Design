public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        CarRepository carRepository = new CarRepository();
        CustomerRepository customerRepository = new CustomerRepository();

        Car car1 = new Car(2,5,250,CarType.SUV,Status.AVAILABLE);
        Customer customer1 = new Customer(3,"Anchal",25);

        Car car2 = new Car(3,7,300,CarType.Luxury,Status.AVAILABLE);
        Customer customer2 = new Customer(5,"Uday",50);

        carRepository.saveCar(car1);
        carRepository.saveCar(car2);
        customerRepository.addCustomer(customer1);
        customerRepository.addCustomer(customer2);

        RentalService rentalService = new RentalService(customerRepository,carRepository);
        Controller controller = new Controller(rentalService);
        Receipt receipt = controller.rentCar(5,CarType.Luxury);

        if(receipt == null){
            System.out.println("Some issue is there maybe customer or car is not available");
        }
        else{
            System.out.println(receipt.getInTime());
        }





    }
}
