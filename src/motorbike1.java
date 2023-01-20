public class motorbike1 {

    int age = 11;

    int power = 22;

    int turbo = 55;

    int getAge() {
        return age;

    }

    int calculateIndex () { return power * 10 + turbo; }

    int upgradePower(int newPower ) {
        power = power + newPower;
        return power;

    }





}
