package concreteProduct;

import abstractProduct.CarSpecification;

public class USCarSpecification implements CarSpecification {

    @Override
    public void printSpecification() {
        System.out.println("It's a left hand drive car");
    }
}
