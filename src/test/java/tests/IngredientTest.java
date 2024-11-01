package tests;

import org.junit.Before;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;
import static tests.base.ConstantsForTests.*;

public class IngredientTest {

    private Ingredient ingredient;

    @Before
    public void setUp() {
        ingredient = new Ingredient(IngredientType.SAUCE, INGREDIENT_MUSTARD, INGREDIENT_PRICE);
    }

    @Test
    public void getPriceTest() {
        assertEquals(INGREDIENT_PRICE, ingredient.getPrice(), DEVIATION);
    }

    @Test
    public void getNameTest() {
        assertEquals(INGREDIENT_MUSTARD, ingredient.getName());
    }

    @Test
    public void getTypeTest() {
        assertEquals(IngredientType.SAUCE, ingredient.getType());
    }
}