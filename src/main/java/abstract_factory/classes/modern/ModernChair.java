package abstract_factory.classes.modern;

import abstract_factory.interfaces.Chair;

public class ModernChair implements Chair {
    @Override
    public String getStyle() {
        return "Модерн Кресло";
    }
}
