package app;

import java.util.ArrayList;
import java.util.List;

import app.interfaces.Visitable;
import app.interfaces.Visitor;
import app.model.ItemSoldInPieces;
import app.model.ItemSoldInWeight;

/*
* https://italiancoders.it/visitor-pattern/
*/
public class App {

    public static void main( String[] args ) {

        System.out.println( "Demo VISITOR behavioral patttern" );

        List<Visitable> items = new ArrayList<>();
        ItemSoldInPieces p1 = new ItemSoldInPieces("CO1", "Cereali",  2.30D, 2);
        ItemSoldInPieces p2 = new ItemSoldInPieces("CO2", "Quaderno", 1.10D, 1);
        ItemSoldInWeight p3 = new ItemSoldInWeight("CO3", "Mele",     2.50D, 2.5D);
        items.add(p1);
        items.add(p2);
        items.add(p3);
        Double totalCost = calculateCost(items);
        System.out.println("Total cost " + totalCost + " €");
    }

    private static Double calculateCost(List<Visitable> items) {
        Double total = 0.0D;
        Visitor visitor = new ShoppingVisitor();
        for(Visitable item : items){
            total = total + item.accept(visitor);
        }
        return total;

    }
}
