package com.kometsales.stepsdefinitions;

import com.kometsales.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static com.kometsales.userinterfaces.KometViajeEspacialLoginPage.USER;
import static com.kometsales.userinterfaces.KometViajeEspacialLoginPage.PASSWORD;
import static com.kometsales.userinterfaces.KometViajeEspacialLoginPage.BTN_LOGIN;

public class KometsalesStepsdefinitions {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }
    @Given("^\"([^\"]*)\" desea ir a la pagina de \"([^\"]*)\"$")
    public void deseaIrALaPaginaDe(String actor, String url) {
        theActorCalled(actor).wasAbleTo(Open.url(url));
    }

    @When("^Ingresa nombre de usuario y password$")
    public void ingresaNombreDeUsuarioYPassword() {
        theActorInTheSpotlight().attemptsTo(Login.in("user", "password",USER,PASSWORD,BTN_LOGIN));

    }

    @When("^Seleccionar la fecha de partida$")
    public void seleccionarLaFechaDePartida() {

    }

    @When("^Seleccionar la fecha de regreso$")
    public void seleccionarLaFechaDeRegreso() {

    }

    @When("^Ingresar cantidad de niños y de adultos en el viaje$")
    public void ingresarCantidadDeNiñosYDeAdultosEnElViaje() {

    }

    @When("^Seleccionar el lugar de destino aplicando filtros$")
    public void seleccionarElLugarDeDestinoAplicandoFiltros() {

    }

    @When("^ingresar datos checkout$")
    public void ingresarDatosCheckout() {

    }

    @When("^ingresar promocode y aplicar$")
    public void ingresarPromocodeYAplicar() {

    }

    @Then("^Valida que al valor total se le aplico descuento y clic en pay now$")
    public void validaQueAlValorTotalSeLeAplicoDescuentoYClicEnPayNow() {

    }

}
