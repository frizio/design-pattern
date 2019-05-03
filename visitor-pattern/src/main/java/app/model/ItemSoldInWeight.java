package app.model;

import app.interfaces.Visitable;
import app.interfaces.Visitor;
import lombok.Getter;
import lombok.Setter;


/**
 * ItemSoldInWeight
 */
@Getter
@Setter
public class ItemSoldInWeight extends Item implements Visitable {

    private Double unitPrice;
    private Double weight;

    public ItemSoldInWeight(String code, String description, Double unitPrice, Double weight) {
        super(code, description);
        this.unitPrice = unitPrice;
        this.weight = weight;
    }

    @Override
    public Double accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}