package DesignPattern.Strategy;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your choice: ");

      String choice = scanner.nextLine();
      LoginStrategy loginStrategy = LoginStrategyFactory.getLoginStrategy(choice);
      loginStrategy.login();

    }
}
