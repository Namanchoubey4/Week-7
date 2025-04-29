import java.util.*;
pakage StoreFront;
class Customer{
    private String name ;
    StoreFront shop;
    private Map<String,Integer> shoppingList;

    public Customer(String name){
        this.name = name ;
        this.shoppingList = new HashMap<>();
    }
    public void addItemToList(String item , int quantity){
        shoppingList.put(item,quantity);
    }
    public String getName(){
        return name;
    }
int totlaAmount = 0
    public void requestProduct(StoreFront shop, String productName, int quantity) {
            System.out.println("\n" + name + " is requesting " + quantity + " " + productName + "(s).");
            boolean result = shop.processOrder(productName, quantity);
            if (result) {
                System.out.println(name + ": Purchase successful.");
            } else {
                System.out.println(name + ": Purchase failed.");
            }
        }


    }
    public void receiveBill(List<String> billItems,double totalAmount){
        System.out.println("\n========= 🧾 BILL RECEIPT =========");
        System.out.printf("%-10s %-15s %-10s %-10s\n", "Item ID", "Name", "Qty", "Amount");

        for(String billLine:billItems){
            System.out.println(billLine);
        }
        System.out.println("---------------------------------------");
        System.out.println("Total Bill: Rs%.2f\n ,"+totalAmount);



        System.out.println("Thank you for shopping , "+name+"!");
        System.out.println("=========================================");
    }
}