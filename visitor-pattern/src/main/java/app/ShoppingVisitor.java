package app;

import app.interfaces.Visitor;
import app.model.ItemSoldInPieces;
import app.model.ItemSoldInWeight;

/**
 * ShoppingVisitor
 */
public class ShoppingVisitor implements Visitor {

    @Override
    public Double visit(ItemSoldInWeight item) {
        return item.getWeight() * item.getUnitPrice();
    }

    @Override
    public Double visit(ItemSoldInPieces item) {
        return item.getNumberOfPieces() * item.getUnitPrice();
    }

    
}