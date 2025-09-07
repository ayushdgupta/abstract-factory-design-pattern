package concreteFactory;

import abstractFactory.CarFactory;
import abstractProduct.Car;
import abstractProduct.CarSpecification;
import concreteProduct.IndianCar;
import concreteProduct.IndianCarSpecification;

public class IndianCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new IndianCar();
    }

    @Override
    public CarSpecification createSpecification() {
        return new IndianCarSpecification();
    }
}
