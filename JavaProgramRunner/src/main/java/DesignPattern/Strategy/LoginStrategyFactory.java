package DesignPattern.Strategy;

public class LoginStrategyFactory {
    public static LoginStrategy getLoginStrategy(String loginType) {
     LoginStrategy loginStrategy = null;

     if(loginType.equalsIgnoreCase("username")) {
            loginStrategy = new UsernameLogin();
        } else if(loginType.equalsIgnoreCase("otp")) {
            loginStrategy = new OtpLogin();
        } else if(loginType.equalsIgnoreCase("google")) {
            loginStrategy = new GoogleLogin();
        }
        return loginStrategy;
    }
}
