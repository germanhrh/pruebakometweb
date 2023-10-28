package com.kometsales.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarInformacion implements Question {

    private Target target;

    public ValidarInformacion(Target target) {
        this.target = target;
    }

    public static ValidarInformacion delCampo(Target target) {
        return new ValidarInformacion(target);
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }
}
