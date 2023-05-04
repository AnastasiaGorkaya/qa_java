package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final String lionSex = "Самец";
    @Mock
    Feline feline;

    @Test
    public void checkLionSexUndefinedThrowsExceptionSuccess() {
        Exception exception = assertThrows(Exception.class, () -> new Lion(feline, "Средний род"));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void checkLionGetKittensSuccess() throws Exception {
        Lion lion = new Lion(feline, lionSex);

        int expectedResult = 1;

        Mockito.when(feline.getKittens()).thenReturn(expectedResult);

        int actualResult = lion.getKittens();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkLionDoesHaveManeSuccess() throws Exception {
        Lion lion = new Lion(feline, lionSex);

        boolean actualResult = lion.doesHaveMane();

        assertEquals(lion.hasMane, actualResult);
    }

    @Test
    public void checkLionGetFoodSuccess() throws Exception {
        Lion lion = new Lion(feline, lionSex);

        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedResult);

        List<String> actualResult = lion.getFood();

        assertEquals(expectedResult, actualResult);
    }
}