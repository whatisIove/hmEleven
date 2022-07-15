package ua.wrappers;

import java.nio.charset.StandardCharsets;

public class StringTest {
    public static void main(String[] args) {

        String str1 = "Saturday";

        String str2 = new String("Saturday");

        char data[] = {'S', 'a', 't', 'u', 'r', 'd', 'a', 'y'};
        String str3 = new String(data);

        byte b = 127;
        String str4 = String.valueOf(b);

        byte[] bytes = {0, 1, 2, 3, 4, 5};
        String str5 = new String(bytes, StandardCharsets.UTF_8);

        StringBuilder builder = new StringBuilder("Saturday");
        String str6 = builder.toString();

        System.out.println(str1 + ", " + str2 + ", " + str3 + ", " + str4 + ", " + str5 + ", " + str6 + "\n");

        String str = "Orange, Apple, Pomegranate, Pear";
        String[] fruits = str.split(", ");
        String max = fruits[0];

        for (int i = 1; i < fruits.length; ++i) {
            if (max.length() < fruits[i].length()) max = fruits[i];
        }
        System.out.println(max.toLowerCase());

        String str7 = " I_new_string      ";
        String str8 = str7.trim().replaceAll("_", " ");
        System.out.println("\n" + str8);

        String scanner = "Error!";
        System.out.println("You entered: " + scanner);

        if (scanner.startsWith("Start!"))
            System.out.println("Starting process.");

        if (scanner.endsWith("End!"))
            System.out.println("Process finish.");

        if (scanner.toLowerCase().contains("error!"))
            System.out.println("An error has occurred.");

        StringBuilder all = new StringBuilder();
        all.append(str).append(str1).append(str2).append("\n").append(str3).append(str4).append(str6)
                .append("\n").append(str8).append(scanner);
        StringBuilder finAll = all.reverse();
        System.out.println("\n" + finAll);

    }
}