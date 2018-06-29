package clases.ar_deco;

import interfaces.Chair;
import interfaces.FurnitureFactory;
import interfaces.Sofa;
import interfaces.Table;

public class ArDecoFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArDecoSofa();
    }

    @Override
    public Table createTable() {
        return new ArDecoTable();
    }
}
