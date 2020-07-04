public class PaymentCalculator {

    private final static double ZUS = 1000;
    public static double nettoYearPayment(Employee employee){
        return employee.getReward() *12;
    }
    public static double bruttoYearPayment (Employee employee ){
        double nettoReward = employee.getReward();
        double bruttoReward = nettoReward * 0.2;
        return  12* (nettoReward + bruttoReward + ZUS);

    }
}
