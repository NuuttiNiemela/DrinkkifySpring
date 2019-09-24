package fi.academy.drinkkifyspring.entities;

public class Drinks_recipes {

    private Integer id;
    private Integer drinks_id;
    private Integer ingredients_id;
    private Integer ingredients_amount;
    private String ingredients_unit;

    public Drinks_recipes() {
        this.id = null;
        this.drinks_id = null;
        this.ingredients_amount = null;
        this.ingredients_unit = "";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDrinks_id() {
        return drinks_id;
    }

    public void setDrinks_id(Integer drinks_id) {
        this.drinks_id = drinks_id;
    }

    public Integer getIngredients_id() {
        return ingredients_id;
    }

    public void setIngredients_id(Integer ingredients_id) {
        this.ingredients_id = ingredients_id;
    }

    public Integer getIngredients_amount() {
        return ingredients_amount;
    }

    public void setIngredients_amount(Integer ingredients_amount) {
        this.ingredients_amount = ingredients_amount;
    }

    public String getIngredients_unit() {
        return ingredients_unit;
    }

    public void setIngredients_unit(String ingredients_unit) {
        this.ingredients_unit = ingredients_unit;
    }

    public String toString() {
        return String.format("drinks_recipes{id=%d, drinks_id=%d, ingredients_id=%d, ingredients_amount=%d, ingredient_unit=%s", id, drinks_id, ingredients_id, ingredients_amount, ingredients_unit);
    }
}
