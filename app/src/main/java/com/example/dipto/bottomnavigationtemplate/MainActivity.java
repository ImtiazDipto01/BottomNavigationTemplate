package com.example.dipto.bottomnavigationtemplate;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.dipto.bottomnavigationtemplate.Fragment.BurgerFragment;
import com.example.dipto.bottomnavigationtemplate.Fragment.DrinksFragment;
import com.example.dipto.bottomnavigationtemplate.Fragment.MoreFragment;
import com.example.dipto.bottomnavigationtemplate.Fragment.PizzaFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        PizzaFragment pizzaFragment = new PizzaFragment();
        FragmentTransaction pizza_ft = getSupportFragmentManager().beginTransaction();
        pizza_ft.replace(R.id.new_container, pizzaFragment, "Pizza Fragment");
        pizza_ft.commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_pizza:
                    PizzaFragment pizzaFragment = new PizzaFragment();
                    FragmentTransaction pizza_ft = getSupportFragmentManager().beginTransaction();
                    pizza_ft.replace(R.id.new_container, pizzaFragment, "Pizza Fragment");
                    pizza_ft.commit();
                    return true;

                case R.id.action_burger:
                    BurgerFragment burgerFragment = new BurgerFragment();
                    FragmentTransaction burger_ft = getSupportFragmentManager().beginTransaction();
                    burger_ft.replace(R.id.new_container, burgerFragment, "Burger Fragment");
                    burger_ft.commit();
                    return true;

                case R.id.action_drink:
                    DrinksFragment drinksFragment = new DrinksFragment();
                    FragmentTransaction drinks_ft = getSupportFragmentManager().beginTransaction();
                    drinks_ft.replace(R.id.new_container, drinksFragment, "Drink Fragment");
                    drinks_ft.commit();
                    return true;

                case R.id.action_more:
                    MoreFragment moreFragment = new MoreFragment();
                    FragmentTransaction more_ft = getSupportFragmentManager().beginTransaction();
                    more_ft.replace(R.id.new_container, moreFragment, "More Fragment");
                    more_ft.commit();
                    return true;
            }
            return false;
        }
    };
    // now add methods
}
