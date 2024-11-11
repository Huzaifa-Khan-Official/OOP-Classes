class Main {
    public static void main(String[] args) {
        SportsBike s1 = new SportsBike();
        s1.brake();
        MountainBike m1 = new MountainBike();
        m1.brake();
    }
}

abstract class MotorBike {
    abstract void brake();
}

class SportsBike extends MotorBike {
    public void brake() {
        System.out.println("Sports Bike Brake");
    }
}

class MountainBike extends MotorBike {
    public void brake() {
        System.out.println("Mountain Bike brake");
    }
}