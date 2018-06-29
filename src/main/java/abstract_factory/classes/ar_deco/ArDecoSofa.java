package abstract_factory.classes.ar_deco;

import abstract_factory.interfaces.Sofa;

public class ArDecoSofa implements Sofa {
    @Override
    public String getStyle() {
        return "Ар-Деко Диван";
    }
}
