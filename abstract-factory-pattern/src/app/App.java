package app;

/*
* https://italiancoders.it/abstract-factory-design-pattern/
*/
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Demo ABSTRACT FACTORY creational pattern");
        AbstractFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}