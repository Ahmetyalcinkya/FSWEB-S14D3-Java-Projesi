import com.workintech.polymorphism.Car;
import com.workintech.polymorphism.Ford;
import com.workintech.polymorphism.Holden;
import com.workintech.polymorphism.Mitsubishi;
import com.workintech.polymorphism2.CarSkeleton;
import com.workintech.polymorphism2.ElectricCar;
import com.workintech.polymorphism2.GasPoweredCar;
import com.workintech.polymorphism2.HybridCar;

public class Main {

    public static void carProcess() {
        Car car = new Car(8, "Base car");
        car.startEngine();
        car.accelerate();
        car.brake();
        System.out.println("----------------------------");

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();
        System.out.println("----------------------------");

        Car ford = new Ford(6, "Ford Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();
        System.out.println("----------------------------");

        Car holden = new Holden(6, "Holden Commodore");
        holden.startEngine();
        holden.accelerate();
        holden.brake();
        System.out.println("----------------------------");

    }

    public static void carCompany() {
        CarSkeleton skeleton = new CarSkeleton("Random",
                "Random skeleton decription.");
        skeleton.startEngine();
        skeleton.drive();
        System.out.println("----------------------------");
        CarSkeleton OpelAstra = new GasPoweredCar("Opel Astra Sedan",
                "2020 MODEL 1.4 T ASTRA BENZİN EDİTİON PLUS OTOMATİK",
                10.98, 4);
        OpelAstra.startEngine();
        System.out.println("----------------------------");
        CarSkeleton PorscheTaycan = new ElectricCar("Porsche Taycan Turbo S",
                "TAYCAN TURBO S 761hp",
                3.5,100);
        PorscheTaycan.startEngine();
        System.out.println("----------------------------");
        CarSkeleton AudiA3 = new HybridCar("Audi A3", "Sedan 35 TFSI S Line",16.97,100, 4);
        AudiA3.startEngine();
        AudiA3.drive();
        System.out.println("----------------------------");
    }
    public static void main(String[] args) {
        carProcess();
        carCompany();
    }
}