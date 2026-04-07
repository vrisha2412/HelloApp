package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


        public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("Hello, World!");
                return;
            }
            StringBuilder nameBuilder = new StringBuilder();
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }
            String result;
            if (nameBuilder.length() > 0) {
                result = nameBuilder.substring(0, nameBuilder.length() - 2);
            } else {
                result = "";
            }
            System.out.println("Hello, " + result + "!");
        }
    }
