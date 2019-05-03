package app;

import java.util.Arrays;

/*
* https://italiancoders.it/factory-method-design-pattern/
*/
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Demo FACTORY METHOD creational pattern");

        AnimalFactory factory = new AnimalFactory();
        Arrays.stream(AnimalEnum.values()).forEach(
            type -> System.out.println( "Il verso e' " + factory.getAnimal(type).getCall() )
        );
    }
}