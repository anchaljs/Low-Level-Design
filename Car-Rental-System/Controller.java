import java.util.List;

public class Controller {

   RentalService rentalService;
   Controller(RentalService rentalService){
       this.rentalService = rentalService;
   }

   public Receipt rentCar(int customerId,CarType carType){
       return rentalService.rentCar(customerId,carType);

   }


}
