package co.com.tcs.testlinio.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class GoShoppingCar{

    public static final Target BUTTON_GO_SHOOPING_CAR = Target.the("ir al carrito de compra")
            .locatedBy("//a[text()=\"Ir al carrito\"]");

    public static final Target MESSAGE = Target.the("mensaje confirmacion")
            .locatedBy("//h2[text()=\"Tu producto se agregó al carrito\"]");
}
