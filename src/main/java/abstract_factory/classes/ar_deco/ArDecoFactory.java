package abstract_factory.classes.ar_deco;

import abstract_factory.interfaces.Chair;
import abstract_factory.interfaces.FurnitureFactory;
import abstract_factory.interfaces.Sofa;
import abstract_factory.interfaces.Table;

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
