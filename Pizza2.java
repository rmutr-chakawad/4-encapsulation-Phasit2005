import java.util.ArrayList;
import java.util.List;

public class Pizza2 {
    private final int MAX_TOPPINGS = 5; // ลดจำนวนสูงสุดเพื่อให้ทดสอบง่ายขึ้น
    private List<Topping> toppings;
    private double basePrice = 120.0; // ปรับราคาพื้นฐาน

    public Pizza2() {
        this.toppings = new ArrayList<>();
    }

    public boolean addTopping(Topping topping) {
        if (toppings.size() < MAX_TOPPINGS) {
            this.toppings.add(topping);
            System.out.println("เพิ่มเครื่องปรุง " + topping.getName() + " เรียบร้อยแล้ว");
            return true;
        } else {
            System.out.println("ไม่สามารถเพิ่มเครื่องปรุง " + topping.getName() + " ได้ เนื่องจากครบจำนวนสูงสุดแล้ว");
            return false;
        }
    }

    public int getToppingCount() {
        return this.toppings.size();
    }

    public double calculatePrice() {
        double totalPrice = basePrice;
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice();
        }
        return totalPrice;
    }

    public void printToppings() {
        System.out.println("รายการเครื่องปรุงใน Pizza2:");
        if (toppings.isEmpty()) {
            System.out.println("  - ไม่มีเครื่องปรุง");
        } else {
            for (Topping topping : toppings) {
                System.out.println("  - " + topping.getName() + " (ราคา: " + topping.getPrice() + " บาท)");
            }
        }
    }
}