package concreteProduct;

import abstractProduct.Car;

public class IndianCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembled an Indian car like Vitara");
    }
}
