package co.com.tcs.testlinio.tasks;

import co.com.tcs.testlinio.userinterfaces.ShoppinCar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class DeleteProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppinCar.BUTTON_DELETE)
        );
    }

    public static DeleteProduct deleteProduct(){
        return new DeleteProduct();
    }

}
