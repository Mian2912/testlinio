package co.com.tcs.testlinio.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoppinCar {

    public static final Target BUTTON_DELETE = Target.the("eliminiar el producto")
            .locatedBy("//a[text()=\"Eliminar\"]");
}
