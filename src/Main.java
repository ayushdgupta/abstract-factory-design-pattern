import abstractFactory.CarFactory;
import concreteFactory.IndianCarFactory;
import concreteFactory.USCarFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        CarFactory indianCar = new IndianCarFactory();
        indianCar.createCar().assemble();
        indianCar.createSpecification().printSpecification();

        CarFactory USCar = new USCarFactory();
        USCar.createCar().assemble();
        USCar.createSpecification().printSpecification();
    }
}