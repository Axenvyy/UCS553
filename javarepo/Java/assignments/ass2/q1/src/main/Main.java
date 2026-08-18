package main;

import food.model.*;
import food.utility.OrderUtility;

public class Main {
    
    public static void main(String[] args){
        FoodOrder.setRestaurantName("javacafe");

        FoodOrder[] orders=new FoodOrder[6];

        orders[0] = new RegularOrder(103, "person1", 500);
        orders[1] = new PremiumOrder(107, "secondperson", 1000);
        orders[2] = new RegularOrder(143, "teejabanda", 750);
        orders[3] = new PremiumOrder(144, "fourthperson", 1200);
        orders[4] = new RegularOrder(135, "personfive", 600);
        orders[5] = new PremiumOrder(195, "sixthperson", 900);
        

        for (FoodOrder order : orders){
            OrderUtility.generateOrderSummary(order);
        }
        FoodOrder.displayTotalOrders();
    }
}
