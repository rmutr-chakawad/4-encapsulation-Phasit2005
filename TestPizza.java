public class TestPizza {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza();
        myPizza.addTopping("ชีส");
        myPizza.addTopping("ไส้กรอก");
        myPizza.addTopping("เห็ด");
        myPizza.printAllTopping();
        System.out.println("ราคารวม: " + myPizza.getPrice() + " บาท");
    }
}