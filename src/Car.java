public class Car {

    int age = 0;

    int power = 150;

    int turbo = 30;

    int getAge() {
        return age;
    }

    int calculateIndex() {
        return power*5+power;
    }

    int upgradePower(int newPower) {
        power = power + newPower;
        return power;
    }

}
