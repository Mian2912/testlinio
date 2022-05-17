package co.com.tcs.testlinio.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LinioPage {

    public static final Target CATEGORIES = Target.the("categories")
            .locatedBy("//div[@class=\"icon icon-hamburger\"]");
    public static final Target CATEGORIES_HOGAR = Target.the("categories hogar")
            .locatedBy("//span[text()=\"Hogar\"]");

    public static final Target COLCHONES_Y_BASECAMA = Target.the("Colchones y Base Cama")
            .locatedBy("//img[@title=\"Colchones y Base Cama\"]");
}
