import java.time.LocalTime;
import java.util.Date;

public class Receipt {

    Car car;
    Customer customer;

    public Receipt(Car car , Customer customer) {
        this.car = car;
        this.customer = customer;
        this.inTime = LocalTime.now();
    }

    public int getReceipt_id() {
        return receipt_id;
    }

    public void setReceipt_id(int receipt_id) {
        this.receipt_id = receipt_id;
    }

    private int receipt_id;

    public LocalTime getInTime() {
        return inTime;
    }

    public void setInTime(LocalTime inTime) {
        this.inTime = inTime;
    }

    private LocalTime inTime;

    public LocalTime getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(LocalTime returnTime) {
        this.returnTime = returnTime;
    }

    private LocalTime returnTime;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;
}
