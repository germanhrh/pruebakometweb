package com.kometsales.tasks;

import com.kometsales.userinterfaces.KometViajeEspacialHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import static com.kometsales.utils.Util.generarString;

public class IngresarPromoCode implements Task {

//public String total;


    public static IngresarPromoCode aplicar() {
        return Tasks.instrumented(IngresarPromoCode.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        //total = Text.of(KometViajeEspacialHomePage.TOTAL).viewedBy(actor).asString();
        actor.attemptsTo(
                Enter.theValue(generarString(10)).into(KometViajeEspacialHomePage.PROMECODE),
                Click.on(KometViajeEspacialHomePage.APPLYCODE)
        );

    }
}
