package fi.academy.drinkkifyspring.entities;

public class Drinks_recipes {

    private Integer id;
    private String ingredient_name;
    private Integer amount;
    private String unit;

    public Drinks_recipes() {
        this.id = null;
        this.ingredient_name = "";
        this.amount = null;
        this.unit = "";
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String toString() {
        return String.format("drinks_recipes{id=%d, ingredient_name=%s, amount=%d, unit=%s}", id, ingredient_name, amount, unit);
    }
}
