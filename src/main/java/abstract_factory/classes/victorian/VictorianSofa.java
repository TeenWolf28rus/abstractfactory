package abstract_factory.classes.victorian;

import abstract_factory.interfaces.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public String getStyle() {
        return "Викторианский Диван";
    }
}
