package main;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        print("hello");
    }

    static String scan() {
        return new Scanner(System.in).nextLine();
    }

    static void print(String string) {
        System.out.println(string);
    }
}
