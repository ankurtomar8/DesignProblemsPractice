package DesignPattern.Strategy;

public class OtpLogin implements LoginStrategy {
    @Override
    public void login() {
        System.out.println("OTP Login");
    }
}
