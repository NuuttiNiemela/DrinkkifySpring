package fi.academy.drinkkifyspring.entities;

public class Drink_ingredient {

    private Integer id;
    private String ingredient_name;
    private Integer userAdded;

    public Drink_ingredient() {
        this.ingredient_name = "";
        this.userAdded = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIngredient_name() {
        return ingredient_name;
    }

    public void setIngredient_name(String ingredient_name) {
        this.ingredient_name = ingredient_name;
    }

    public Integer getUserAdded() {
        return userAdded;
    }

    public void setUserAdded(Integer userAdded) {
        this.userAdded = userAdded;
    }

    @Override
    public String toString() {
        return String.format("Drinks_ingredients{id=%d, drink_name=%s, userAdded=%d}", id, ingredient_name, userAdded );
    }

}
