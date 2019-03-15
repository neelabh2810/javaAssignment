package com.neelabh;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String sel;
        int triesLeft = 4;
        int i, j, k, count = 0;

        System.out.println("Tries Left: " + triesLeft);

        String[] words = new String[]{"School", "House", "College", "Laptop", "Laboratory", "Hindustan", "Adidas",
                "Mobile"};
        String[] wordDesc = new String[]{"House of Education", "We live here", "Place greater than school less than home",
                "A form of computer", "Production house of chemicals", "Saare Jaha Se Acha....Humara", "One preferred sports brand",
                "All in one electronic gadget"};

        int a = (int) ((Math.random() * 7) + 1);

        System.out.println(wordDesc[a]);

        sel = words[a];

        char[] ch = sel.toCharArray();

        int len = ch.length;

        char[] ch1 = new char[len];
        char[] ch2 = new char[len];

        i = 0;
        while (triesLeft != 0) {
            for (j = 0; j < len; j++) {
                ch1[j] = scanner.next().charAt(0);
                if (ch1[j] == ch[j]) {
                    ch2[j] = ch1[j];
                    System.out.println("Letter Matched");
                    System.out.println("Guessed Letter: " + ch1[j]);
                    System.out.print(" Word: ");
                    for (k = 0; k < len; k++) {
                        System.out.print(ch2[k]);
                    }
                } else if (ch1[j] != ch[j]) {
                    System.out.println("Wrong! Please Try Again");
                    System.out.println("Guessed Letter: " + ch1[j]);
                    triesLeft--;
                    System.out.println("Tries left: " + triesLeft);
                    if (triesLeft == 0) {
                        break;
                    }
                    --j;
                }
            }
        }
    }
}