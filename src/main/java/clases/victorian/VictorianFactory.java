package clases.victorian;

import interfaces.Chair;
import interfaces.FurnitureFactory;
import interfaces.Sofa;
import interfaces.Table;

public class VictorianFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
