import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BudgetPlanner {
    public final List<FinancialTransaction> Transactions = new ArrayList<>();
    public final List<Area> Areas = new ArrayList<>();

    public void createTransaction(User user, int sum, Date date, Area area){
        Transactions.add(new FinancialTransaction(user, sum, date, area));
    }

    public void createAllAreas(){
        //mb create from default file
        List<String> wastes = new ArrayList<String>(Arrays.asList("Clothes", "Food","House","Education","Cafe", "Gifts")); //траты
        List<String> incomes = new ArrayList<String>(Arrays.asList("zarplata","aktcii","pensia","gifts")); //доходы
        //mb better enums
        for (String waste : wastes ){
            Areas.add(new Area(waste, -1));
        }
        for (String income : incomes ){
            Areas.add(new Area(income, 1));
        }
    }


}
