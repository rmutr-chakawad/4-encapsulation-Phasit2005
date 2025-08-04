import java.util.ArrayList;

public class Pizza {
    private static final int MAX_TOPPINGS = 10;
    private ArrayList<String> toppings;
    private int totalToppings;

    public Pizza() {
        toppings = new ArrayList<>();
        totalToppings = 0;
    }

    public void addTopping(String topping) {
        if (totalToppings < MAX_TOPPINGS) {
            toppings.add(topping);
            totalToppings++;
        } else {
            System.out.println("ไม่สามารถเพิ่มเครื่องปรุงได้เกิน 10 รายการ");
        }
    }

    public void printAllTopping() {
        System.out.println("เครื่องปรุงที่ใส่:");
        for (String topping : toppings) {
            System.out.println("- " + topping);
        }
    }

    public int getPrice() {
        return 100 + (totalToppings * 10);
    }
}