package food.model;

public abstract class FoodOrder {

    private int orderId;
    private String customerName;
    private double amount;

    private static String restaurantName;
    private static int totalOrders;

    public FoodOrder(int id, String Name, double amt){
        orderId=id;
        customerName= Name;
        amount=amt;

        totalOrders++;
    }

    public abstract double calculateDeliveryCharge();

    public int getOrderId(){return this.orderId;}
    public void setOrderId(int newID){this.orderId=newID;}
    public String getCustomerName(){ return this.customerName;}
    public void setCustomerName(String newName){this.customerName=newName;}
    public double getAmount(){return this.amount;}
    public void setAmount(double newAmt){this.amount=newAmt;}

    public static void setRestaurantName(String name){
        restaurantName=name;}
    public static String getRestaurantName(){return restaurantName;}
    public static int getTotalOrders(){return totalOrders;}
    public static void displayTotalOrders(){System.out.println("Total orders "+totalOrders);}
}
