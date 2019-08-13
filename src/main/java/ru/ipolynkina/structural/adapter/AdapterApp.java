package main.java.ru.ipolynkina.structural.adapter;

public class AdapterApp {
    public static void main(String[] args) {

        // inheritance
        VectorAdapterFromRaster adapter = new VectorAdapterFromRaster();
        adapter.drawLine();
        adapter.drawSquare();

        // composition
        VectorAdapterFromRaster2 adapter2 = new VectorAdapterFromRaster2(new RasterGraphics());
        adapter2.drawLine();
        adapter2.drawSquare();
    }
}
