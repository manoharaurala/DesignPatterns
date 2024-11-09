package structural.decorator.datasource.decorator;

import structural.decorator.datasource.product.Datasource;

public class CompressionDecorator extends BaseDecorator {

    public CompressionDecorator(Datasource nextLayer) {
        super(nextLayer);
    }

    @Override
    public String read() {
        String compressed = previousLayer.read();
        return decompress(compressed);
    }

    private String decompress(String compressed) {
        return compressed + " - Decompressed";
    }

    @Override
    public void write(String value) {
        String compressed = compress(value);
        previousLayer.write(compressed);
    }

    private String compress(String value) {
        return value + " - Compressed";
    }
}
