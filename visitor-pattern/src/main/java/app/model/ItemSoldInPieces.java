package app.model;

import app.interfaces.Visitable;
import app.interfaces.Visitor;
import lombok.Getter;
import lombok.Setter;

/**
 * ItemSoldInPieces
 */
@Getter
@Setter
public class ItemSoldInPieces extends Item implements Visitable {

    private Double unitPrice;
    private Integer numberOfPieces;

    public ItemSoldInPieces(String code, String description, Double unitPrice, Integer numberOfPieces) {
        super(code,description);
        this.unitPrice = unitPrice;
        this.numberOfPieces = numberOfPieces;
    }

	@Override
	public Double accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
