

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ShapeFactory roundShapeFactory = ShapeFactoryProducer.getShapeFactory(true);
        ShapeFactory normalShapeFactory = ShapeFactoryProducer.getShapeFactory(false);

        Shape roundRectangleShape = roundShapeFactory.getShape(ShapeConstants.ROUNDED_RECTANGLE);
        roundRectangleShape.draw();

        Shape normalRectangleShape = normalShapeFactory.getShape(ShapeConstants.RECTANGLE);
        normalRectangleShape.draw();

    }
}