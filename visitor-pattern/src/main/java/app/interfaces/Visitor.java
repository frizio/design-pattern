package app.interfaces;

import app.model.ItemSoldInPieces;
import app.model.ItemSoldInWeight;

/**
 * Visitor
 */
public interface Visitor {

    Double visit( ItemSoldInWeight item );
    Double visit( ItemSoldInPieces item );
}