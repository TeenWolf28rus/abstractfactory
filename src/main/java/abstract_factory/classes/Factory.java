package abstract_factory.classes;

import abstract_factory.interfaces.Chair;
import abstract_factory.interfaces.FurnitureFactory;
import abstract_factory.interfaces.Sofa;
import abstract_factory.interfaces.Table;

public class Factory {
    private FurnitureFactory factory;

    Factory(FurnitureFactory factory) {
        this.factory = factory;
    }

    Chair getChair() {
        return factory.createChair();
    }

    Sofa getSofa() {
        return factory.createSofa();
    }

    Table getTable() {
        return factory.createTable();
    }
}
