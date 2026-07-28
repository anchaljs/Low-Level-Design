public class RentalService {

    private CustomerRepository customerRepository;
    private CarRepository carRepository;

    RentalService(CustomerRepository customerRepository,CarRepository carRepository){
        this.customerRepository = customerRepository;
        this.carRepository = carRepository;
    }

    public Receipt rentCar(int customerId , CarType type){
        Customer customer = customerRepository.findById(customerId);
        if(customer==null){
            System.out.println("customer not found");
            return null;
        }
        Car car = carRepository.findCar(type);
        if(car==null){
            System.out.println("car not found");
            return null;
        }
        car.setStatus(Status.NOT_AVAILABLE);
        Receipt receipt = new Receipt(car,customer);
        return receipt;

    }

}
