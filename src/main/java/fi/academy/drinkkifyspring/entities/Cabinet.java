package fi.academy.drinkkifyspring.entities;

public class Cabinet {

    private Integer users_id;
    private Integer ingredients_id;

    public Cabinet() {
        this.users_id = null;
        this.ingredients_id = null;
    }

    public Integer getUsers_id() {
        return users_id;
    }

    public void setUsers_id(Integer users_id) {
        this.users_id = users_id;
    }

    public Integer getIngredients_id() {
        return ingredients_id;
    }

    public void setIngredients_id(Integer ingredients_id) {
        this.ingredients_id = ingredients_id;
    }

    @Override
    public String toString() {
        return String.format("Cabinet{users_id=%d, ingredients_id=%d}", users_id, ingredients_id);
    }

}
