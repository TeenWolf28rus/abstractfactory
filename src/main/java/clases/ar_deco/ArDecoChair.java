package clases.ar_deco;

import interfaces.Chair;

public class ArDecoChair implements Chair {
    @Override
    public String getStyle() {
        return "Ар-Деко кресло";
    }
}
