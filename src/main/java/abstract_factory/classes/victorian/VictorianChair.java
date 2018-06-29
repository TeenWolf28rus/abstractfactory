package abstract_factory.classes.victorian;

import abstract_factory.interfaces.Chair;

public class VictorianChair implements Chair
{
    @Override
    public String getStyle() {
        return "Викторианское Кресло";
    }
}
