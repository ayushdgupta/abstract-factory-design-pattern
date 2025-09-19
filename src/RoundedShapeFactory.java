
public class RoundedShapeFactory implements ShapeFactory{

    public RoundedShapeFactory() {
        System.out.println("Round shape factory object created");
    }

    @Override
    public Shape getShape(String shapeName) {
        return switch (shapeName){
            case ShapeConstants.ROUNDED_RECTANGLE -> new RoundedRectangle();
            case ShapeConstants.ROUNDED_SQUARE -> new RoundedSquare();
            default -> {
                System.out.println("NO shape found for shape "+shapeName);
                yield null;
            }
        };
    }
}
