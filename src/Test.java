public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Mateusz", "Argasiński", 3400);
        double nettoPayment = PaymentCalculator.nettoYearPayment(employee);
        double bruttoPayment = PaymentCalculator.bruttoYearPayment(employee);
        System.out.println("Roczna wypłata netta : " + nettoPayment);
        System.out.println("Roczna wypłata brutto : " + bruttoPayment);


    }
}
