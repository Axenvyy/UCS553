package food.utility;

import food.model.FoodOrder;
import food.service.Discountable;

public class OrderUtility {

    public static boolean validateAmount(double amount){
        return amount>0;
    }

    public static boolean validateCustomerName(String name){
        return name != null && !name.trim().isEmpty();
    }
    
    public static void generateOrderSummary(FoodOrder order){

        double discount=0;
        if(order instanceof Discountable){
        discount= ((Discountable) order).applyDiscount();
       
    }
     double delivery= order.calculateDeliveryCharge();
        double finalAmount=order.getAmount()+delivery-discount;

        System.out.println("Final Amount to be paid "+finalAmount);

    }
}
