package DesignPattern.Strategy;

public class GoogleLogin implements LoginStrategy{
    @Override
    public void login() {
        System.out.println(" Google Login");
    }
}
