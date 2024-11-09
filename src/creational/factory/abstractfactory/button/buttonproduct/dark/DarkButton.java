package creational.factory.abstractfactory.button.buttonproduct.dark;

import creational.factory.abstractfactory.button.buttonproduct.Button;
import lombok.Getter;

@Getter
public class DarkButton extends Button {
    private final Double length;

    public DarkButton(Double border, Double length) {
        super(border);
        this.length = length;
    }

    @Override
    public void render() {
        System.out.println("Dark square Btn was clicked!");

    }

    @Override
    public void click() {
        System.out.println("Dark square Btn Rendered!");
    }
}
