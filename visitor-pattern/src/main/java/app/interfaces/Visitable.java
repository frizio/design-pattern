package app.interfaces;

/**
 * Visitable
 */
public interface Visitable {
    Double accept( Visitor visitor );
}