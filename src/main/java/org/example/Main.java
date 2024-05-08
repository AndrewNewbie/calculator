package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        double num1=scanner.nextFloat();

        System.out.println("Введіть друге число : ");
        double num2=scanner.nextFloat();

        double res;
        System.out.println("Дія:");
    String action=scanner.nextLine();
    action=scanner.nextLine();
    switch (action){
        case "+":
     res=num1+num2;
     System.out.println("Результат: "+res);
     break;
        case "-":
            res=num1-num2;
            System.out.println("Результат: "+res);
            break;
        case "*":
            res=num1*num2;
            System.out.println("Результат: "+res);
            break;
        case "/":
            if (num2 == 0)
                System.out.println("Error:");
            else {
             res=num1/num2;
                System.out.println("Результат: " + res);
            }break;
     }
    }
}