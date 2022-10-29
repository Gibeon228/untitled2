package org.example;

import java.util.List;
import java.util.ArrayList;

public class zadacha2 {
    static int n = 0;

    public static void main(String[] args) {
        int count = 0;
        String str1 = "2?  +   ?5 = 69";
        String str2 = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                str2 = str2 + str1.charAt(i);
                if (str1.charAt(i) == '?') {
                    count++;
                }
            }
        }
        str1 = "";
        int[] vopros = new int[count];
        char[] zamena = new char[count];
        for (int i = 0; i < count; i++) {
            zamena[i] = '0';
        }
        count = 0;
        char[] array = new char[str2.length()];
        for (int i = 0; i < str2.length(); i++) {
            array[i] = str2.charAt(i);
            if (array[i] == '?') {
                vopros[count] = i;
                count++;
            }
        }
        Reshenie(zamena, vopros, array);
    }

    static boolean Reshenie(char[] Zamena, int[] Vopros, char[] Array) {
        String finalyStr = "";
        for (int i = 0; i < Vopros.length; i++) {
            Array[Vopros[i]] = Zamena[i];
        }
        for (int i = 0; i < Array.length; i++) {
            finalyStr = finalyStr + Array[i];
        }
        finalyStr = finalyStr.replace('+', '=');
        String[] newFinalyStr = finalyStr.split("=");
        if (Integer.parseInt(newFinalyStr[0]) + Integer.parseInt(newFinalyStr[1]) == Integer.parseInt(newFinalyStr[2])) {
            System.out.println(newFinalyStr[0] + " + " + newFinalyStr[1] + " = " + newFinalyStr[2]);
            return true;
        }
       String s = "";
        for (int i = 0; i < Zamena.length; i++) {
            s = s + Zamena[i];
        }
       int a = Integer.parseInt(s);
        a++;
        s = String.valueOf(a);
        while (s.length() < Zamena.length) {
            s = '0' + s;
        }
        for (int i = 0; i < s.length(); i++) {
            Zamena[i] = s.charAt(i);
        }
        Reshenie(Zamena, Vopros, Array);
        return false;
    }
}

