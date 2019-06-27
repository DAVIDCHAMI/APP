package co.com.bancolombia.certificacion.app.utilidades.mobileelementfinder;

public class BaseLocatorBuilder implements Builder<BaseLocator> {
    private String android;
    private String ios;

    public BaseLocatorBuilder(){
        this.android="";
        this.ios="";
    }

    public static BaseLocatorBuilder locator (){
        return  new BaseLocatorBuilder();
    }

    public BaseLocatorBuilder withAndroid(String android){
      this.android=android;
        return this;
    }

    public BaseLocatorBuilder withIos(String ios){
        this.ios=ios;
        return this;
    }

    public String getAndroid() {
        return android;
    }

    public String getIos() {
        return ios;
    }

    @Override
    public BaseLocator build() {
        return new BaseLocator (this);
    }
}