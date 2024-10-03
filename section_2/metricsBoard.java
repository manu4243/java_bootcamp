public class metricsBoard {
    public static void main(String[] args) {
        double sales = 24309.65;
        double profit = 18562.18;
        double refunds = 688.78;
        double shipping = 1233.57;

        int intSales = (int)sales;
        int intProfit = (int)profit;
        int intRefunds = (int)refunds;
        int intShipping = (int)shipping;

        System.out.println("These are the metrics results:\nSales equal to " + intSales);
        System.out.println("Profit equal to " + intProfit);
        System.out.println("Refunds equal to " + intRefunds);
        System.out.println("Shipping cost equal to " + intShipping);
    }
}
