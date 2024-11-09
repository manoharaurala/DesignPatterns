package structural.decorator.datasource.decorator;

import structural.decorator.datasource.product.Datasource;

// Step 4 - Create concrete decorators
public class EncryptionDecorator extends BaseDecorator {
    public EncryptionDecorator(Datasource nextLayer) {
        super(nextLayer);
    }

    @Override
    public String read() {
        String value = previousLayer.read();
        return decrypt(value);

    }

    private String decrypt(String value) {
        return value + " - Decrypted";
    }

    @Override
    public void write(String value) {
        String encrypted = encrypt(value);
        previousLayer.write(encrypted);

    }

    private String encrypt(String value) {
        return value + " - Encrypted";
    }

}
