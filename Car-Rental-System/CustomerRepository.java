mport javax.print.attribute.standard.ColorSupported;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    List<Customer> customers = new ArrayList<>();

    public Customer findById(int id){
        for(Customer customer:customers){
            if(customer.getCust_id() == id ){
                return customer;
            }
        }
        return null;
    }

    public  void addCustomer(Customer cust){

        customers.add(cust);
    }

}
