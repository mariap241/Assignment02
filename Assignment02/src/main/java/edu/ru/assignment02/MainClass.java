package edu.ru.assignment02;

public class MainClass {

    public static void main(String[] args) {

    int result = addAllDigits(638);
        System.out.println(result);

    }

    public static int addAllDigits(int inputNumber) {

        int num = inputNumber % 10;
        int num2 = inputNumber / 10;
        int num3 = num2 % 10;
        int num4 = num2 / 10;
        
       
        int result = num + num3  +num4;
        System.out.println(num + " " + num2 + " " + num3 + " " + num4);
        return result;
    }
}
