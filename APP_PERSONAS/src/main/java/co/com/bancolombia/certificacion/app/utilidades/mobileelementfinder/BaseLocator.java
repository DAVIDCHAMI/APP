package co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder;

import org.openqa.selenium.By;

public class BaseLocator {
    private String android;
    private String ios;

    public BaseLocator(Locator locator) {
        this.android = locator.getAndroid();
        this.ios = locator.getIos();
    }

    public String getAndroidLocatedBy(){
        return getLocatedBy(android);
    }

    public String getIosLocatedBy(){
        return getLocatedBy(ios);
    }

    public By getAndroid() {
        return getBy(android);
    }

    public By getIos() {
        return getBy(ios);
    }

    private String getLocatedBy(String baseLocator){
        String[] locators = baseLocator.split("\\$");
        return locators[1];
    }

    private By getBy(String baseLocator){
        String[] locators = baseLocator.split("\\$");
        String locator = locators[0];
        String path = locators[1];
        By resp;
        switch (locator){
            case "id":
                resp = By.id(path);
                break;
            case "xpath":
                resp = By.xpath(path);
                break;
            case "className":
                resp = By.className(path);
                break;
            default:
                resp = By.id(path);
        }
        return resp;
    }
}
