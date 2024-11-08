package creational.factory.factorymethod.button.buttonproduct;

import lombok.Getter;

@Getter
public class RoundButton extends Button {
    private final Double radius;

    public RoundButton(Double border, Double radius) {
        super(border);
        this.radius = radius;

    }

    @Override
    public void render() {
        System.out.println("Rendered!");

    }

    @Override
    public void onClick() {
        System.out.println("Round Btn was clicked!");

    }
}
