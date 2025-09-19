public class ShapeFactoryProducer {

    public static ShapeFactory getShapeFactory(boolean rounded){
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new NormalShapeFactory();
        }
    }
}
