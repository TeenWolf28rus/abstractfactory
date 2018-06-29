package abstract_factory.classes;

import abstract_factory.classes.ar_deco.ArDecoFactory;
import abstract_factory.classes.modern.ModernFactory;
import abstract_factory.classes.victorian.VictorianFactory;
import abstract_factory.interfaces.FurnitureFactory;

import java.util.Scanner;

public class MainFactory {
    public static void main(String[] args) {
        print("Введите один из стилей Ар-Деко, Модерн, Викторианский \n");
        String style = scan();
        print("Вы ввели " + style + " \n");
        FurnitureFactory furnitureFactory;
        switch (style) {
            case "Ар-Деко": {
                furnitureFactory = new ArDecoFactory();
                break;
            }
            case "Модерн": {
                furnitureFactory = new ModernFactory();
                break;
            }
            case "Викторианский": {
                furnitureFactory = new VictorianFactory();
                break;
            }
            default: {
                print("Нет такого варианта");
                return;
            }

        }

        Factory factory = new Factory(furnitureFactory);
        print(factory.getChair().getStyle() + "\n");
        print(factory.getSofa().getStyle() + "\n");
        print(factory.getTable().getStyle() + "\n");
    }

    static String scan() {
        return new Scanner(System.in).nextLine();
    }

    static void print(String string) {
        System.out.println(string);
    }
}
