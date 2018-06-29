package abstract_factory.classes.ar_deco;

import abstract_factory.interfaces.Chair;

public class ArDecoChair implements Chair {
    @Override
    public String getStyle() {
        return "Ар-Деко кресло";
    }
}
