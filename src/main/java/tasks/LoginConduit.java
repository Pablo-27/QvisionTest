package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static userinterfaces.LoginConduitPage.INPUT_EMAIL;
import static userinterfaces.LoginConduitPage.INPUT_PASSWORD;
import static userinterfaces.LoginConduitPage.LOGIN_BUTTON;
import static userinterfaces.ConduitMainPage.BTN_SIGN_IN;

public class LoginConduit implements Task {

    private String email;
    private String password;

    public LoginConduit(String email, String password){
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_SIGN_IN),
                Enter.theValue(email).into(INPUT_EMAIL),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(LOGIN_BUTTON));
    }

    public static LoginConduit with(String email, String password){
        return Tasks.instrumented(LoginConduit.class, email, password);
    }
}
