package Uppgift7;

public class Main {
    public static void main(String[] args) {

        var car = new Car();
        var motorcycle = new Motorcycle();
        var spaceShip = new SpaceShip();
        var testInjection = new MakeVeichleStartEngine();

        testInjection.startingVeichleWithDependency(car);
        testInjection.startingVeichleWithDependency(motorcycle);
        testInjection.startingVeichleWithDependency(spaceShip);

    }
}
