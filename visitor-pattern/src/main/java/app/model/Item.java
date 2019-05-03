package app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Item
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public abstract class Item {
    protected String code;
    protected String description;
}
