package main.java.ru.ipolynkina.structural.adapter;

public class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphics {

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
