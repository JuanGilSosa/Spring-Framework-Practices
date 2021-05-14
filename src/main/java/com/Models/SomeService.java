package com.Models;

import java.beans.ConstructorProperties;

/**
 * @author juan gil sosa
 * <p>
 *     Puede ser que el funcionamiento de un objeto
 *      con IoC (Inversion de Control) sea la implementacion
 *      con el patron de diseño Singleton.
 * </p>
 * */
public class SomeService {

    private static final SomeService myService = new SomeService();
    private String data;

    public SomeService(){
        this("");
    }
    @ConstructorProperties({"data"})
    public SomeService(String data){
        this.data = data;
    }

    public static SomeService createInstance() {
        return myService;
    }

    public String getData(){
        return this.data;
    }

    public void setData(String data){
        this.data = data;
    }
}
