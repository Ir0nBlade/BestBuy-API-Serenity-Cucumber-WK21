package com.bestbuy.model;

/**
 * @author Vimal Vithalpura
 * @project BestBuy-API-Serenity-Cucumber
 * @created 22/01/2022
 */
public class ServicesPojo {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ServicesPojo getServicesPojo (String name){
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName(name);
        return servicesPojo;
    }
}
