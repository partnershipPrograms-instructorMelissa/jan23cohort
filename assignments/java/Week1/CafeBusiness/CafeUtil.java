package assignments.java.Week1.CafeBusiness;

public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 0; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sum = prices[0];
        for (int i = 1; i <= prices.length; i++) {
            sum += i;
        }
        return sum;
    }
}
