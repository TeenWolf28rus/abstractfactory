package abstract_factory.classes.modern;

import abstract_factory.interfaces.Table;

public class ModernTable implements Table {
    @Override
    public String getStyle() {
        return "Модерн Столик";
    }
}
