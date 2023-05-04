package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    private Feline feline;

    @Before
    public void initFeline() {
        feline = new Feline();
    }

    @Test
    public void felineEatMeatSuccess() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");

        List<String> actualResult = feline.eatMeat();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void felineGetFamilySuccess() {
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void felineGetKittensNoParamsSuccess() {
        int expectedResult = 1;

        int actualResult = feline.getKittens();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void felineGetKittensWithParamSuccess() {
        int expectedResult = 3;
        int actualResult = feline.getKittens(expectedResult);

        assertEquals(expectedResult, actualResult);
    }
}