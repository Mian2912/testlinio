package co.com.tcs.testlinio.tasks;

import co.com.tcs.testlinio.userinterfaces.ColchonesBasecama;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

public class SelectProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ColchonesBasecama.IMAGE_DOBLE),
                Click.on(ColchonesBasecama.COMBO_COLCHON),
                Click.on(ColchonesBasecama.BUTTON_BUY)
        );
    }

    public static SelectProduct selectProduct(){
        return new SelectProduct();
    }
}
