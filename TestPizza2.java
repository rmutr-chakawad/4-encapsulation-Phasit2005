public class TestPizza2 {
    public static void main(String[] args) {
        System.out.println("===== เริ่มต้นการทดสอบ Pizza2 =====");

        Pizza2 myPizza = new Pizza2();

        // เพิ่มเครื่องปรุง
        myPizza.addTopping(Topping.PEPPERONI);
        myPizza.addTopping(Topping.MUSHROOM);
        myPizza.addTopping(Topping.CHEESE);

        // แสดงผลลัพธ์
        myPizza.printToppings();
        System.out.println("จำนวนเครื่องปรุงทั้งหมด: " + myPizza.getToppingCount() + " ชนิด");
        System.out.println("ราคารวมของพิซซ่า: " + myPizza.calculatePrice() + " บาท");

        System.out.println("\n===== ทดลองเพิ่มเครื่องปรุงเกินจำนวน =====");
        myPizza.addTopping(Topping.ONION);
        myPizza.addTopping(Topping.PINEAPPLE);
        myPizza.addTopping(Topping.PEPPERONI); // อันนี้จะเกินจำนวนสูงสุด 5 ชนิด

        myPizza.printToppings();
        System.out.println("จำนวนเครื่องปรุงทั้งหมด: " + myPizza.getToppingCount() + " ชนิด");
        System.out.println("ราคารวมของพิซซ่า: " + myPizza.calculatePrice() + " บาท");
    }
}