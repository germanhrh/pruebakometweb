package com.kometsales.tasks;

import com.kometsales.userinterfaces.KometViajeEspacialHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarFechaRegreso implements Task {

    public static IngresarFechaRegreso seleccionar() {
        return Tasks.instrumented(IngresarFechaRegreso.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //WaitUntil.the(BuscarPage.InputBuscar,isEnable()),
                Click.on(KometViajeEspacialHomePage.RETURNINGDATE),
                Click.on(KometViajeEspacialHomePage.RETURNINGDATEOK)
        );
    }
}
