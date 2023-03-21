import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(){
        int sum = 0;
        for(int i = sum; i < 11; i++){
            sum += i;
        }
        return sum;
     }

    public double getOrderTotal(double[]prices) {
        double sum = 0;
        for(int i = 0; i < prices.length; i++){
            sum = sum + prices[i];
            System.out.println(sum);
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menu){
        for( int i = 0; i < menu.size(); i++){
            System.out.println(i + " " + menu.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name");
        String userName = System.console().readLine();
        System.out.println("Hello" + userName);
        System.out.println("There are" + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }
}