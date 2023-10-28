package com.kometsales.tasks;

;
import com.kometsales.userinterfaces.KometViajeEspacialHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ValidarDescuento implements Task {

   public static ValidarDescuento pagar() {
        return Tasks.instrumented(ValidarDescuento.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(KometViajeEspacialHomePage.TERMS),
                Click.on(KometViajeEspacialHomePage.PAYNOW)
        );
    }
}
