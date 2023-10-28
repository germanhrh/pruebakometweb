package com.kometsales.tasks;

import com.kometsales.userinterfaces.KometViajeEspacialHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class IngresarViajeros implements Task {

    public static IngresarViajeros seleccionar() {
        return Tasks.instrumented(IngresarViajeros.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(KometViajeEspacialHomePage.ADULTS),
                Click.on(KometViajeEspacialHomePage.ADULTSVAL),
                Click.on(KometViajeEspacialHomePage.CHILDRENS),
                Click.on(KometViajeEspacialHomePage.CHILDRENSVAL)
        );

    }
}
