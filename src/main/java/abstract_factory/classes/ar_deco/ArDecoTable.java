package abstract_factory.classes.ar_deco;

import abstract_factory.interfaces.Table;

public class ArDecoTable implements Table {
    @Override
    public String getStyle() {
        return "Ар-Деко Стол";
    }
}
