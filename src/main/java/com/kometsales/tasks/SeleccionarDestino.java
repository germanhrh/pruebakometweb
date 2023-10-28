package com.kometsales.tasks;

import com.kometsales.userinterfaces.KometViajeEspacialHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.Wait;

import java.time.Duration;


public class SeleccionarDestino implements Task {

    public static SeleccionarDestino filtrar() {
        return Tasks.instrumented(SeleccionarDestino.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(KometViajeEspacialHomePage.PLANET)

        );
        try {
            Thread.sleep(2 * 1000); // Esperar la cantidad de segundos especificada en milisegundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        KometViajeEspacialHomePage.PLANETVAL.waitingForNoMoreThan(Duration.ofSeconds(2));
        actor.attemptsTo(
                Click.on(KometViajeEspacialHomePage.PLANETVAL),
                Click.on(KometViajeEspacialHomePage.BOOK)
        );
    }
}
