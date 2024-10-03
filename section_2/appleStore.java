public class appleStore {
    public static void main(String[] args) {
        double profit = 0;
        int numOfCustomers = 0;
        int numOfApples = 500;

        System.out.println("A customer enter the store and buy 4 apples");
        numOfCustomers++;
        numOfApples -= 4;
        System.out.println("Number of customers is equal to " + numOfCustomers + ".\nNumber of apples is equal to " + numOfApples);
        System.out.println("A customer enter the store and buy 20 apples");
        numOfCustomers++;
        numOfApples -= 20;
        System.out.println("Number of customers is equal to " + numOfCustomers + ".\nNumber of apples is equal to " + numOfApples);
        System.out.println("A customer enter the store and buy 200 apples");
        numOfCustomers++;
        numOfApples -= 200;
        System.out.println("Number of customers is equal to " + numOfCustomers + ".\nNumber of apples is equal to " + numOfApples);
    }
}
