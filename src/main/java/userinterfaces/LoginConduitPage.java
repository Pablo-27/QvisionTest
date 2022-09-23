package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginConduitPage {

    public static final Target INPUT_EMAIL = Target.the("Input field -> email").locatedBy("//input[@formcontrolname=\"email\"]");
    public static final Target INPUT_PASSWORD = Target.the("Input field -> password").locatedBy("//input[@formcontrolname=\"password\"]");
    public static final Target LOGIN_BUTTON = Target.the("Button to login").locatedBy("//button[text()=\" Sign in \"]");
    public static final Target TEX_TO_VALIDATE = Target.the("Text to validate after login").locatedBy("(//a[@class=\"nav-link\"])[3]");
}
