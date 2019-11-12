import java.util.Date;

public class FinancialTransaction {
    public Date Date;
    public User Owner;
    public int Sum; //always >=0
    public Area Area;

    public FinancialTransaction(User user, int sum, Date date, Area area){
        if (sum <= 0)
            return; //???
        Owner = user;
        Area = area;
        Date = date;
        Sum = sum;
    }
}
