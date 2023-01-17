public class Main {
    public static void main(String[] args) {

        Car Mers1 = new Car();
        Car Mers2 = new Car();

        System.out.println(Mers1.getAge);
        System.out.println(Mers1.calculateIndex());
        System.out.println(Mers2.power);
        System.out.println(Mers2.upgradePower(150));
        System.out.println(Mers2.calculateIndex());
    }
}