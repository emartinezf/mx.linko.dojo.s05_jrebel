package mx.linko.dojo.s05.jrebel.vo;

import com.google.gson.Gson;

/**
 *
 * @author emartinez
 */
public class PersonVO {
    private String name;
    private String app;
    private String apm;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
    
}
