package ua.org.oa.TaisKotliar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    //1
    public static int calculateMax(int[] array1) {
        int result = 0;
        Arrays.sort(array1);
        result = array1[array1.length - 1];
        return result;
    }

    //2
    public static double calculateAverage(int[] array2) {
        double average = 0;
        double temp = 0;
        for (int i = 0; i < array2.length; i++) {
            temp += array2[i];
        }
        average = temp / array2.length;
        return average;
    }

    //3
    public static ArrayList<String> makeCapitalLetters(ArrayList<String> list) {
        ArrayList<String> changedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i).toUpperCase();
            changedList.add(string);
        }
        return changedList;
    }

    //4
    public static int calculateEven() {
        int[] array4 = {1, 3, 55, 6, 7, 8, 23, 11, 55, 33, 22, 4, 5, 7, 8, 9, 12};
        int sumEven = 0;
        for (int i = 0; i < array4.length; i++) {
            if ((array4[i] % 2) == 0) {
                sumEven += array4[i];
            }
        }
        return sumEven;
    }

    //5
    public static String  longestSequence(String str1, String str2) {
        String str3 = "";

        for (int i = 0; i < str1.length(); i++) {
            String temp = "";
            int matchIndex = i;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(matchIndex) == str2.charAt(j)) {
                    temp += str1.charAt(matchIndex);
                    if (matchIndex < str1.length() - 1) matchIndex++;
                } else {
                    if (!temp.isEmpty()) {
                        if (temp.length() >= str3.length()) str3 = temp;
                        temp = "";
                        matchIndex = i;
                    }

                }
            }
        }
        return str3;
    }
}