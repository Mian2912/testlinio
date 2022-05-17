package co.com.tcs.testlinio.tasks;

import co.com.tcs.testlinio.userinterfaces.LinioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.plaf.basic.BasicSliderUI;
import java.util.List;

public class GoHogar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LinioPage.CATEGORIES),
                Click.on(LinioPage.CATEGORIES_HOGAR),
                Click.on(LinioPage.COLCHONES_Y_BASECAMA)
        );
    }



    public static GoHogar goHogar(){
        return new GoHogar();
    }
}
