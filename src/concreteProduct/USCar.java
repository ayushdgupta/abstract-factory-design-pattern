package concreteProduct;

import abstractProduct.Car;

public class USCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembled an US car like Audi");
    }
}
