package creational.factory.factorymethod.button.buttonproduct;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Button {
    private Double border;

    public abstract void render();

    public abstract void onClick();
}
