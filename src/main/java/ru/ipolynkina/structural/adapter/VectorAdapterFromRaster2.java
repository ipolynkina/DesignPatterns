package main.java.ru.ipolynkina.structural.adapter;

public class VectorAdapterFromRaster2 implements VectorGraphics {

    private RasterGraphics rasterGraphics;

    public VectorAdapterFromRaster2(RasterGraphics rasterGraphics) {
        this.rasterGraphics = rasterGraphics;
    }

    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}
