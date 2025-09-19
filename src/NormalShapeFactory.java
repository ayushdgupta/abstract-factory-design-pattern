public class NormalShapeFactory implements ShapeFactory{

    public NormalShapeFactory() {
        System.out.println("Normal shape factory object created");
    }

    @Override
    public Shape getShape(String shapeName) {
        return switch (shapeName){
            case ShapeConstants.RECTANGLE -> new Rectangle();
            case ShapeConstants.SQUARE -> new Square();
            default -> {
                System.out.println("no shape found for shape "+shapeName);
                yield null;
            }
        };
    }
}
