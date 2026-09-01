//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.make = "Ford";
        car1.model = "Mustang";
        car1.isRunning = true;
        System.out.println(car1.make);
        System.out.println(car1.model);
        car1.startCar();
        System.out.println("Is Car 1 Running? " + car1.isRunning);


        car2.make = "Porsche";
        car2.model = "911";
        car2.isRunning = false;
        System.out.println(car2.make);
        System.out.println(car2.model);
        System.out.println(car2.isRunning);
        car2.startCar();
        System.out.println("Is Car 2 Running? " + car2.isRunning);


    }
}