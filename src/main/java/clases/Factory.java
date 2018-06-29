package clases;

import interfaces.Chair;
import interfaces.FurnitureFactory;
import interfaces.Sofa;
import interfaces.Table;

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
