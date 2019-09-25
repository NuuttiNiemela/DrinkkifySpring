package fi.academy.drinkkifyspring.dao;

import fi.academy.drinkkifyspring.entities.Drink;
import fi.academy.drinkkifyspring.entities.Drink_ingredient;
import fi.academy.drinkkifyspring.entities.Drinks_recipes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DrinksDao {
    @Autowired
    private JdbcTemplate jdbc;

    public List<Drink> allDrinks() {
        String sql = "SELECT * FROM drinks";
        List<Drink> searched = jdbc.query(sql,
                new RowMapper<Drink>() {
                    @Override
                    public Drink mapRow(ResultSet results, int i) throws SQLException {
                Drink drink = new Drink();
                drink.setId(results.getInt("id"));
                drink.setDrink_name(results.getString("drink_name"));
                drink.setDrink_instructions(results.getString("drink_instructions"));
                        String sqlIngredients = "SELECT drinks_ingredients.id AS id, drinks_ingredients.ingredient_name AS ingredient_name, drinks_recipes.ingredients_amount AS amount, drinks_recipes.ingredients_unit AS unit FROM drinks_recipes INNER JOIN drinks_ingredients ON drinks_recipes.ingredients_id = drinks_ingredients.id WHERE drinks_recipes.drinks_id = " + drink.getId();
                List<Drinks_recipes> ingredients = jdbc.query(sqlIngredients,
                        new RowMapper<Drinks_recipes>() {
                            @Override
                            public Drinks_recipes mapRow(ResultSet rsIngredient, int a) throws SQLException {
                                Drinks_recipes recipe = new Drinks_recipes();
                                recipe.setId(rsIngredient.getInt("id"));
                                recipe.setIngredient_name(rsIngredient.getString("ingredient_name"));
                                recipe.setAmount(rsIngredient.getInt("amount"));
                                recipe.setUnit(rsIngredient.getString("unit"));
                                return recipe;
                            }
                        });
                drink.setIngredients(ingredients);
                return drink;
            }
                });
        return searched;
    }

    public List<Drink> drinksByName(String name) {
        String sql = "SELECT * FROM drinks WHERE drink_name ILIKE ?";
        List<Drink> searched = jdbc.query(sql, new String[]{'%'+name+'%'},
                new RowMapper<Drink>() {
                    @Override
                    public Drink mapRow(ResultSet results, int i) throws SQLException {
                        Drink drink = new Drink();
                        drink.setId(results.getInt("id"));
                        drink.setDrink_name(results.getString("drink_name"));
                        drink.setDrink_instructions(results.getString("drink_instructions"));
                        String sqlIngredients = "SELECT drinks_ingredients.id AS id, drinks_ingredients.ingredient_name AS ingredient_name, drinks_recipes.ingredients_amount AS amount, drinks_recipes.ingredients_unit AS unit FROM drinks_recipes INNER JOIN drinks_ingredients ON drinks_recipes.ingredients_id = drinks_ingredients.id WHERE drinks_recipes.drinks_id = " + drink.getId();
                        List<Drinks_recipes> ingredients = jdbc.query(sqlIngredients,
                                new RowMapper<Drinks_recipes>() {
                                    @Override
                                    public Drinks_recipes mapRow(ResultSet rsIngredient, int a) throws SQLException {
                                        Drinks_recipes recipe = new Drinks_recipes();
                                        recipe.setId(rsIngredient.getInt("id"));
                                        recipe.setIngredient_name(rsIngredient.getString("ingredient_name"));
                                        recipe.setAmount(rsIngredient.getInt("amount"));
                                        recipe.setUnit(rsIngredient.getString("unit"));
                                        return recipe;
                                    }
                                });
                        drink.setIngredients(ingredients);
                        return drink;
                    }
                });
        return searched;
    }

    


}
