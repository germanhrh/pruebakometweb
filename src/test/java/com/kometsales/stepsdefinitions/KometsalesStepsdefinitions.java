package com.kometsales.stepsdefinitions;

import com.kometsales.exceptions.ExcepcionGeneral;
import com.kometsales.questions.ValidarInformacion;
import com.kometsales.tasks.*;
import com.kometsales.userinterfaces.KometViajeEspacialHomePage;
import com.kometsales.utils.ErrorMessage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static com.kometsales.userinterfaces.KometViajeEspacialLoginPage.USER;
import static com.kometsales.userinterfaces.KometViajeEspacialLoginPage.PASSWORD;
import static com.kometsales.userinterfaces.KometViajeEspacialLoginPage.BTN_LOGIN;
import static com.kometsales.utils.Util.generarString;
import static org.hamcrest.Matchers.equalTo;



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
        theActorInTheSpotlight().attemptsTo(Login.in(generarString(10), generarString(12),USER,PASSWORD,BTN_LOGIN));

    }

    @When("^Seleccionar la fecha de partida$")
    public void seleccionarLaFechaDePartida() {
        theActorInTheSpotlight().attemptsTo(IngresarFechaPartida.seleccionar());

    }

    @When("^Seleccionar la fecha de regreso$")
    public void seleccionarLaFechaDeRegreso() {
        theActorInTheSpotlight().attemptsTo(IngresarFechaRegreso.seleccionar());

    }

    @When("^Ingresar cantidad de niños y de adultos en el viaje$")
    public void ingresarCantidadDeNiñosYDeAdultosEnElViaje() {
        theActorInTheSpotlight().attemptsTo(IngresarViajeros.seleccionar());

    }

    @When("^Seleccionar el lugar de destino aplicando filtros$")
    public void seleccionarElLugarDeDestinoAplicandoFiltros() {
        theActorInTheSpotlight().attemptsTo(SeleccionarDestino.filtrar());
    }

    @When("^ingresar datos checkout$")
    public void ingresarDatosCheckout() {
        theActorInTheSpotlight().attemptsTo(IngresarDatos.chekout());
    }

    @When("^ingresar promocode y aplicar$")
    public void ingresarPromocodeYAplicar() {
        theActorInTheSpotlight().attemptsTo(IngresarPromoCode.aplicar());
    }

    @Then("^Valida que al valor total se le aplico descuento y clic en pay now$")
    public void validaQueAlValorTotalSeLeAplicoDescuentoYClicEnPayNow() {
       theActorInTheSpotlight().attemptsTo(ValidarDescuento.pagar());

    }

}
