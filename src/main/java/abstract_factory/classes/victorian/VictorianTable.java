package abstract_factory.classes.victorian;

import abstract_factory.interfaces.Table;

public class VictorianTable implements Table {
    @Override
    public String getStyle() {
        return "Викторианский Столик";
    }
}
