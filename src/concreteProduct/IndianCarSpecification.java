package concreteProduct;

import abstractProduct.CarSpecification;

public class IndianCarSpecification implements CarSpecification {

    @Override
    public void printSpecification() {
        System.out.println("It's a right hand drive car");
    }
}
