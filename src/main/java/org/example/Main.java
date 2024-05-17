package org.example;

import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean isWhileActive = true;
    while (isWhileActive) {
      System.out.println("Дія(є такі варіанти:+,-,*,/,^):");
      String action = scanner.nextLine();

      switch (action) {
        case "+":
          plus();
          break;
        case "-":
          subtraction();
          break;
        case "*":
          multiplication();
          break;
        case "/":
          division();
          break;
        case "^":
          square();
          break;
        default:
          System.out.println("Error:");
      }
      System.out.println("Хочете продовжити?Введить \"yes\" або \"no\"");
      scanner.nextLine();
      String yes_no = scanner.nextLine();
      if (yes_no.equals("no")) {
        isWhileActive = false;
        System.exit(0);
      }
    }
  }

  public static void plus() {
    System.out.println("Введіть перший доданок: ");
    double num1 = scanner.nextFloat();
    System.out.println("Введіть другий: ");
    double num2 = scanner.nextFloat();

    double res;
    res = num1 + num2;
    System.out.println("Результат: " + res);
  }

  public static void subtraction() {
    System.out.println("Введіть зменшуване число: ");
    double num1 = scanner.nextFloat();
    System.out.println("Введіть відє`мник: ");
    double num2 = scanner.nextFloat();

    double res;
    res = num1 - num2;
    System.out.println("Результат: " + res);
  }

  public static void multiplication() {
    System.out.println("Введіть перший добуток: ");
    double num1 = scanner.nextFloat();
    System.out.println("Введіть другий: ");
    double num2 = scanner.nextFloat();

    double res;
    res = num1 * num2;
    System.out.println("Результат: " + res);
  }

  public static void division() {
    System.out.println("Введіть ділене число: ");
    double num1 = scanner.nextFloat();

    System.out.println("Введіть дільник: ");
    double num2 = scanner.nextFloat();

    double res;
    if (num2 == 0) System.out.println("Error:");
    else {
      res = num1 / num2;
      System.out.println("Результат: " + res);
    }
  }

  public static void square() {
    int res;
    System.out.println("Введіть число яке будемо підносити до квадрату: ");
    double num1 = scanner.nextFloat();

    res = (int) (num1 * num1);
    System.out.println("Квадрат: " + res);
  }
}
