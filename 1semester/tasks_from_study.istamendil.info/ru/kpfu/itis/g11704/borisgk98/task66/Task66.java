package ru.kpfu.itis.g11704.borisgk98.task66

import java.lang.*;
import java.util.*;
import java.io.File;

class MyString {
    private char[] str;
    MyString(String string) {
        str = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            str[i] = string.charAt(i);
        }
    }

    MyString() {
        str = new char[0];
    }

    MyString(char[] charArr) {
        str = charArr.clone();
    }

    public void concat (MyString myString) {
        char[] cpStr = new char[this.str.length + myString.str.length];
        for (int i = 0; i < str.length; i++) {
            cpStr[i] = str[i];
        }
        for (int i = str.length; i < cpStr.length; i++) {
            cpStr[i] = myString.str[i - str.length];
        }
        str = cpStr;
    }

    public char[] toCharArray() {
        return str.clone();
    }

    public char charAt(int index) {
        if (index < 0 || index >= str.length) {
            throw new StringIndexOutOfBoundsException();
        }
        return str[index];
    }

    // -1 == not found
    public int indexOf(MyString myString) {
        char[] cpStr = new char[this.str.length + myString.str.length + 1];
        for (int i = 0; i < myString.str.length; i++) {
            cpStr[i] = myString.str[i];
        }
        cpStr[myString.str.length] = ' ';
        for (int i = myString.str.length + 1; i < cpStr.length; i++) {
            cpStr[i] = str[i - myString.str.length - 1];
        }

        // prefix-function
        int[] pF = new int[cpStr.length];
        pF[0] = 0;
        for (int i = 1; i < pF.length; i++) {
            int j = pF[i-1];
            while (j != 0 && cpStr[j] != cpStr[i]) {
                j = pF[j];
            }
            if (cpStr[j] == cpStr[i]) {
                j++;
            }
            pF[i] = j;
            if (pF[i] == myString.str.length) {
                return i - 2 * myString.str.length;
            }
        }
        return -1;
    }

    public MyString substr(int start, int length) {
        char[] cpStr = new char[length];
        for (int i = start; i < start + length; i++) {
            if (i >= str.length) {
                throw new StringIndexOutOfBoundsException();
            }
            cpStr[i - start] = str[i];
        }
        return new MyString(cpStr);
    }

    public String toString() {
        return new String(str);
    }

    //??
    public boolean equals (Object object) {
        throw new IllegalArgumentException(); //Недопустимый параметр при вызове метода
    }

    public boolean equals(MyString myString) {
        return str.equals(myString.str);
    }

    public int length() {
        return str.length;
    }

    MyString[] split(char ch) {
        int arrSize = 0;
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i] != ch && (str[i + 1] == ch || i == str.length - 2)) {
                arrSize++;
            }
        }
        MyString[] myStrings = new MyString[arrSize];
        int i = 0, iter = 0;
        while (true) {
            while (i < str.length && str[i] == ch) {
                i++;
            }
            if (i == str.length)
                break;
            int l = i, r = i;
            while (r < str.length && str[r] != ch) {
                r++;
            }
            myStrings[iter] = new MyString();
            myStrings[iter].str = new char[r - l];
            for (int j = l; j < r; j++) {
                myStrings[iter].str[j - l] = str[j];
            }
            iter++;
            i = r;
            if (i >= str.length) {
                break;
            }
        }
        return myStrings;
    }
}

class Main {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        Scanner scan;
        File file = new File("input.txt");
        scan = new Scanner(file);
        MyString a = new MyString(scan.next()), b = new MyString(scan.next());
        MyString[] arrS = a.split('a');
        for (MyString el : arrS) {
            System.out.println(el);
        }
        System.out.println(a.substr(3, 4));
        System.out.println(a.charAt(1));
        System.out.println(a.equals(b));
        System.out.println(a.indexOf(b));
        System.out.println(a.toCharArray());
        a.concat(b);
        System.out.println(a);
        System.out.println(a.toCharArray());
    }
}