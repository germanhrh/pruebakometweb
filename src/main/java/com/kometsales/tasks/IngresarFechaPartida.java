package com.kometsales.tasks;

import com.kometsales.userinterfaces.KometViajeEspacialHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarFechaPartida implements Task {

    public static IngresarFechaPartida seleccionar() {
        return Tasks.instrumented(IngresarFechaPartida.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(KometViajeEspacialHomePage.DEPARTINGDATE),
                Click.on(KometViajeEspacialHomePage.DEPARTINGDATEOK)

        );
    }
}
