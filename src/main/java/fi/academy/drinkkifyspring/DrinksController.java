package fi.academy.drinkkifyspring;

import fi.academy.drinkkifyspring.dao.DrinksDao;
import fi.academy.drinkkifyspring.entities.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/")
public class DrinksController extends WebSecurityConfigurerAdapter {
    @Autowired
    private DrinksDao dao;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/**")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and().logout().logoutSuccessUrl("/")
                .and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
    }

    @GetMapping("drinks")
    public Iterable<Drink> getAllDrinks() {
        return dao.allDrinks();
    }

    @GetMapping("drinks/haku")
    public Iterable<Drink> getDrinksByName(@RequestParam String name) {
        return dao.drinksByName(name);
    }

}
