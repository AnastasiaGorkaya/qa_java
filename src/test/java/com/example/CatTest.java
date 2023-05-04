package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Cat cat;
    @Mock
    Feline feline;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundTest() {
        String expectedResul = "Мяу";
        String actualResult = cat.getSound();

        Assert.assertEquals(expectedResul, actualResult);
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(feline.eatMeat()).thenReturn(expectedResult);

        List<String> actualResult = cat.getFood();

        assertEquals(expectedResult, actualResult);
    }
}