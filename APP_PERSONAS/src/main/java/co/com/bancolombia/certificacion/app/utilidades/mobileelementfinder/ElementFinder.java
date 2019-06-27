package co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ElementFinder {
    private static final String ANDROID = "Android";
    private static final String PLATFORM_NAME = "platformName";

    public static String getPlatformCapability() {
        AppiumDriver driver = getProxiedDriver();
        return driver.getCapabilities().getCapability(PLATFORM_NAME).toString();
    }

    public static String dynamicElement(BaseLocatorBuilder baseLocator) {
        return (getPlatformCapability().equals(ANDROID)) ?  baseLocator.build().getAndroidLocatedBy() : baseLocator.build().getIosLocatedBy();
    }

    public static By theElementBy(BaseLocatorBuilder baseLocator) {
        return (getPlatformCapability().equals(ANDROID)) ?  baseLocator.build().getAndroid() : baseLocator.build().getIos();
    }
}