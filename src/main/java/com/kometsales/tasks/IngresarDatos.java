package com.kometsales.tasks;

import com.kometsales.userinterfaces.KometViajeEspacialHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

public class IngresarDatos implements Task {

    public static IngresarDatos chekout() {
        return Tasks.instrumented(IngresarDatos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Emmanuel").into(KometViajeEspacialHomePage.NAME),
                Enter.theValue("Emma@gmail.com").into(KometViajeEspacialHomePage.EMAIL),
                Enter.theValue("333-22-4444").into(KometViajeEspacialHomePage.SSN),
                Enter.theValue("+14083334444").into(KometViajeEspacialHomePage.PHONE)
        );
    }
}
