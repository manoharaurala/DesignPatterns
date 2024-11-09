package structural.decorator.datasource.decorator;

import lombok.AllArgsConstructor;
import structural.decorator.datasource.product.Datasource;

// Step 3 - Base decorator
@AllArgsConstructor
public abstract class BaseDecorator implements Datasource {
    protected Datasource previousLayer;
}
