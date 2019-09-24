package fi.academy.drinkkifyspring.entities;

public class Drink {
    private Integer id;
    private String drink_name;
    private String drink_instructions;

    public Drink() {
        this.drink_name = "";
        this.drink_instructions = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString() {
        return String.format("Drinks{id=%d, drink_name=%s, drink_instructions=%s}", id, drink_name, drink_instructions);
    }
}
