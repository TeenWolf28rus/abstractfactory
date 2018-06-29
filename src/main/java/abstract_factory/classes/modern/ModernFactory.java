package abstract_factory.classes.modern;

import abstract_factory.interfaces.Chair;
import abstract_factory.interfaces.FurnitureFactory;
import abstract_factory.interfaces.Sofa;
import abstract_factory.interfaces.Table;

public class ModernFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
