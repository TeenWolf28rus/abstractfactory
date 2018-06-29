package abstract_factory.classes.modern;

import abstract_factory.interfaces.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public String getStyle() {
        return "Модерн Диван";
    }
}
