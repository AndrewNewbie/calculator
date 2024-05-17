package org.example;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double res;
    for (int i = 0; ; ) {
      System.out.println("Дія(є такі варіанти:+,-,*,/,^):");
      String action = scanner.nextLine();

      switch (action) {
        case "+":
          System.out.println("Введіть перший доданок: ");
          double num1 = scanner.nextFloat();

          System.out.println("Введіть другий: ");
          double num2 = scanner.nextFloat();
          plus(num1, num2);
          break;
        case "-":
          System.out.println("Введіть зменшуване число: ");
          num1 = scanner.nextFloat();

          System.out.println("Введіть відє`мник: ");
          num2 = scanner.nextFloat();
          subtraction(num1, num2);
          break;
        case "*":
          System.out.println("Введіть перший добуток: ");
          num1 = scanner.nextFloat();

          System.out.println("Введіть другий: ");
          num2 = scanner.nextFloat();
          multiplication(num1, num2);
          break;
        case "/":
          System.out.println("Введіть ділене число: ");
          num1 = scanner.nextFloat();

          System.out.println("Введіть дільник: ");
          num2 = scanner.nextFloat();
          division(num1, num2);
          break;
        case "^":
          System.out.println("Введіть число яке будемо підносити до квадрату: ");
          num1 = scanner.nextFloat();
          square(num1);
          break;
        default:
          System.out.println("Error:");
      }
      System.out.println("Хочете продовжити?Введить \"yes\" або \"no\"");
      String yes_no = scanner.nextLine();
      if (yes_no.contains("no")) {
        break;
      }
    }
  }

  public static void plus(double a, double b) {
    double res;

    res = a + b;
    System.out.println("Результат: " + res);
  }

  public static void subtraction(double a, double b) {
    double res;
    res = a - b;
    System.out.println("Результат: " + res);
  }

  public static void multiplication(double a, double b) {
    double res;
    res = a * b;
    System.out.println("Результат: " + res);
  }

  public static void division(double a, double b) {
    double res;
    if (b == 0) System.out.println("Error:");
    else {
      res = a / b;
      System.out.println("Результат: " + res);
    }
  }

  public static void square(double a) {
    int res;
    res = (int) (a * a);
    System.out.println("Квадрат: " + res);
  }
}
