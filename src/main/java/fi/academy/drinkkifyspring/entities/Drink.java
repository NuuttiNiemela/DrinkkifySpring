package fi.academy.drinkkifyspring.entities;

import java.util.ArrayList;
import java.util.List;

public class Drink {
    private Integer id;
    private String drink_name;
    private String drink_instructions;
    private List<Drinks_recipes> ingredients;

    public Drink() {
        this.drink_name = "";
        this.drink_instructions = "";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrink_name() {
        return drink_name;
    }

    public void setDrink_name(String drink_name) {
        this.drink_name = drink_name;
    }

    public String getDrink_instructions() {
        return drink_instructions;
    }

    public void setDrink_instructions(String drink_instructions) {
        this.drink_instructions = drink_instructions;
    }

    public List<Drinks_recipes> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Drinks_recipes> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return String.format("Drinks{id=%d, drink_name=%s, drink_instructions=%s}", id, drink_name, drink_instructions);
    }
}
