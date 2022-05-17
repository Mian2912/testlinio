package co.com.tcs.testlinio.questions;

import co.com.tcs.testlinio.userinterfaces.GoShoppingCar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return GoShoppingCar.MESSAGE.resolveAllFor(actor).get(0).getText();
    }

    public static TheMessage isVisible(){
        return new TheMessage();
    }
}
