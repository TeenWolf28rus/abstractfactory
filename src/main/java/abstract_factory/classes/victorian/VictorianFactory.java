package abstract_factory.classes.victorian;

import abstract_factory.interfaces.Chair;
import abstract_factory.interfaces.FurnitureFactory;
import abstract_factory.interfaces.Sofa;
import abstract_factory.interfaces.Table;

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
