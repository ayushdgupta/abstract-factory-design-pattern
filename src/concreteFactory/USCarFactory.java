package concreteFactory;

import abstractFactory.CarFactory;
import abstractProduct.Car;
import abstractProduct.CarSpecification;
import concreteProduct.USCar;
import concreteProduct.USCarSpecification;

public class USCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new USCar();
    }

    @Override
    public CarSpecification createSpecification() {
        return new USCarSpecification();
    }
}
