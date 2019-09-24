package fi.academy.drinkkifyspring.dao;

import fi.academy.drinkkifyspring.entities.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
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
                return drink;
            }
                });
        return searched;
    }


}
