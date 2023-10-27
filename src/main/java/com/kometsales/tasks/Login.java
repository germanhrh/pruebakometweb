package com.kometsales.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Login implements Task {

    private String user;
    private String password;
    private Target fielduser;
    private Target fieldpassword;
    private Target btnlogin;

    public Login(String user, String password, Target fielduser, Target fieldpassword, Target btnlogin) {
        this.user = user;
        this.password = password;
        this.fielduser = fielduser;
        this.fieldpassword = fieldpassword;
        this.btnlogin = btnlogin;
    }
    public static Login in(String user, String password, Target fielduser, Target fieldpassword, Target btnlogin) {
        return Tasks.instrumented(Login.class, user, password, fielduser, fieldpassword, btnlogin);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(user).into(fielduser), Enter.theValue(password).into(fieldpassword),
                Click.on(btnlogin));
    }
}
