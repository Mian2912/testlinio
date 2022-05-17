package co.com.tcs.testlinio.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoShoppingCar implements Task {
        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(co.com.tcs.testlinio.userinterfaces.GoShoppingCar.BUTTON_GO_SHOOPING_CAR)
            );
        }

        public static GoShoppingCar goShoppingCar(){
            return new GoShoppingCar();
        }
    }

