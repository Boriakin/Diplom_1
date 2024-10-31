package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;
import static tests.base.ConstantsForTests.*;

@RunWith(Parameterized.class)
public class BunTest {

    private final String name;
    private final float price;

    public BunTest(String name, float price){
        this.name=name;
        this.price=price;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {NAME_RUS, PRICE},
                {NAME_ENG, PRICE},
                {null, PRICE},
                {"", 0}
        };
    }

    @Test
    public void bunTest(){
        Bun bun = new Bun(name,price);
        assertEquals(name, bun.getName());
        assertEquals(price,
                bun.getPrice(),
                0);
    }

}