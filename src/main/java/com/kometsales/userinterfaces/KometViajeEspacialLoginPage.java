package com.kometsales.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class KometViajeEspacialLoginPage {

    public static final Target USER = Target.the("Usuario").locatedBy("//*[@id=\"login\"]/div[1]/input");
    public static final Target PASSWORD = Target.the("Password").locatedBy("//*[@id=\"login\"]/div[2]/input");
    public static final Target BTN_LOGIN = Target.the("Botón login").locatedBy("//*[@id=\"app\"]/div//button[2]");
}
