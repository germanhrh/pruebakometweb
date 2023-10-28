package com.kometsales.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class KometViajeEspacialHomePage {

    public static final Target DEPARTINGDATEOK = Target.the("Fecha de partida OK").locatedBy("//nav[@class='theme__navigation___3eiS-']/button[2]");
    public static final Target RETURNINGDATEOK = Target.the("Fecha de regreso OK").locatedBy("//nav[@class='theme__navigation___3eiS-']/button[2]");

    public static final Target DEPARTINGDATE = Target.the("Fecha de partida").locatedBy("//*[text()='Departing']/parent::node()/input");
    public static final Target RETURNINGDATE = Target.the("Fecha de regreso").locatedBy("//*[text()='Returning']/parent::node()/input");

    public static final Target ADULTS = Target.the("Cantidad de adultos lista").locatedBy("//input[contains(@value, 'Adult')]");
    public static final Target ADULTSVAL = Target.the("Cantidad de adultos").locatedBy("//input[contains(@value, 'Adult')]//parent::node()//following-sibling::ul/li[contains(text(), '2')]");

    public static final Target CHILDRENS = Target.the("Cantidad de niños lista").locatedBy("//input[contains(@value, 'Children')]");
    public static final Target CHILDRENSVAL = Target.the("Cantidad de niños").locatedBy("//input[contains(@value, 'Children')]//parent::node()//following-sibling::ul/li[contains(text(), '2')]");



    public static final Target PLANET = Target.the("Filtro de planeta").locatedBy("//input[@value='Launch']");
    public static final Target PLANETVAL = Target.the("Filtro de planeta Valor").locatedBy("//input[@value='Launch']//parent::node()//following-sibling::ul/li[contains(text(), 'Madan')]");


    public static final Target COLOR = Target.the("Filtro de color").locatedBy("//input[@value='Planet color']");
    public static final Target PRICE = Target.the("Filtro de precio").locatedBy("//input[@value='1800']");

    public static final Target BOOK = Target.the("Reservar").locatedBy("//h5[contains(text(), 'Madan')]/parent::node()/parent::node()/following-sibling::div[@class='theme__cardActions___1aHjq GalleryItem__cardActions___zE_tm']/button");

    public static final Target NAME = Target.the("Nombre").locatedBy("//*[text()='Name']/preceding-sibling::input");
    public static final Target EMAIL = Target.the("Correo").locatedBy("//*[text()='Email Address']/preceding-sibling::input");
    public static final Target SSN = Target.the("Numero de seguridad social").locatedBy("//*[text()='Social Security Number']/preceding-sibling::input");
    public static final Target PHONE = Target.the("Telefono").locatedBy("//*[text()='Phone Number']/preceding-sibling::input");

    public static final Target PROMECODE = Target.the("Codigo promocional").locatedBy("//*[@name='promo']");
    public static final Target APPLYCODE = Target.the("Aplicar codigo").locatedBy("//button[contains(text(),'Apply')]");

    public static final Target TERMS = Target.the("Aceptar Terminos").locatedBy("//input[@type='checkbox']");
    public static final Target TOTAL = Target.the("Valor total").locatedBy("//strong[@class='OrderSummary__headline-1___1lzsL']");

    public static final Target PAYNOW = Target.the("Comprar ahora").locatedBy("//button[contains(text(),'Pay now')]");





}
