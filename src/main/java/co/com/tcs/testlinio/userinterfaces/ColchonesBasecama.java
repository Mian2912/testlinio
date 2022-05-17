package co.com.tcs.testlinio.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColchonesBasecama {
    public static final Target IMAGE_DOBLE = Target.the("Image").locatedBy("//img[@title=\"Queen\"]");
    public static final Target COMBO_COLCHON = Target.the("combo colchon")
            .locatedBy("//span[text()=\"Super Mega Combo Azul Queen 160x190 Reso...\"]");

    public static final Target BUTTON_BUY = Target.the("añadir")
            .locatedBy("//button[@id=\"buy-now\"]");


}
