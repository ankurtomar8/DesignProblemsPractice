package DesignPattern.Strategy;

public class UsernameLogin implements LoginStrategy {
    @Override
    public void login() {
        System.out.println("Username Login");
    }
}
