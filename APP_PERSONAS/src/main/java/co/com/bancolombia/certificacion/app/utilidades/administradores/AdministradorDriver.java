package co.com.bancolombia.certificacion.app.utilidades.administradores;

import io.appium.java_client.AppiumDriver;

import java.util.Set;

public class AdministradorDriver {

    public static void cambiarContextoDriverWeb(AppiumDriver driver) {
        Set<String> allContext = driver.getContextHandles();
        for (String context : allContext) {
            if (context.contains("WEBVIEW"))
                driver.context(context);
        }
    }

    public static void cambiarContextoDriverNativo(AppiumDriver driver) {
        Set<String> contextNames = driver.getContextHandles();
        for (String contextName : contextNames) {
            if (contextName.contains("NATIVE"))
                driver.context(contextName);
        }
    }
}
