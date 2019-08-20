package main.java.ru.ipolynkina.behavioral.template;

import main.java.ru.ipolynkina.behavioral.template.helper.Helper;
import main.java.ru.ipolynkina.behavioral.template.helper.HelperA;
import main.java.ru.ipolynkina.behavioral.template.helper.HelperB;

public class TemplateMethodApp {
    public static void main(String[] args) {

        Helper a = new HelperA();
        a.help();

        System.out.println(" * * * ");
        Helper b = new HelperB();
        b.help();
    }
}
