package creational.factory.factorymethod.button.buttonproduct;

import lombok.Getter;

@Getter
public class SquareButton extends Button {
    private final Double length;

    public SquareButton(Double border, Double length) {
        super(border);
        this.length = length;
    }

    @Override
    public void render() {
        System.out.println("Rendered!");

    }

    @Override
    public void onClick() {
        System.out.println("Square Btn was clicked!");

    }
}
