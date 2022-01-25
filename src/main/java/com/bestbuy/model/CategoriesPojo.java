package com.bestbuy.model;

/**
 * @author Vimal Vithalpura
 * @project BestBuy-API-Serenity-Cucumber
 * @created 22/01/2022
 */
public class CategoriesPojo {

    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static CategoriesPojo getCategoriesPojo(String name, String id){
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setName(name);
        categoriesPojo.setId(id);
        return categoriesPojo;
    }
}
