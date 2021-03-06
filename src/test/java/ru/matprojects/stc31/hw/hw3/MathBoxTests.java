package ru.matprojects.stc31.hw.hw3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.matprojects.stc31.hw.MathBox;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


class MathBoxTests {
    private MathBox mathBox;
    private final Integer[] intArr = {1, 2, 3, 4, 5, 6, 6, 6};

    @BeforeEach
    void setUp() {
        mathBox = new MathBox(intArr);
    }

    @Test
    void summatorMathBoxTest(){
        assertEquals(21d, mathBox.summator());
    }

    @Test
    void splitterMathBoxTest(){
        mathBox.splitter(2);
        Set<Number> testSet = new HashSet<>();
        testSet.addAll(Arrays.asList(0.5, 1d, 1.5, 2d, 2.5, 3d));
        assertEquals(testSet, mathBox.getNumSet());
    }

    @Test
    void toStringTest() {
        System.out.println(mathBox.toString());
    }

    @Test
    void equalsTest() {
        Integer[] testArr = {1, 2, 3, 4};
        MathBox testMB = new MathBox(testArr);
        assertNotEquals(testMB, mathBox);
        testMB = new MathBox(intArr);
        assertEquals(testMB, mathBox);
        assertNotEquals(15, mathBox);
    }

    @Test
    void hashCodeTest() {
        MathBox testMB = new MathBox(intArr);
        assertEquals(mathBox.hashCode(), testMB.hashCode());
    }

    @Test
    void hashMapTest() {
        HashMap<MathBox, Integer> testMap = new HashMap<>();
        testMap.put(mathBox, 15);
        assertEquals(15, testMap.get(mathBox));
        MathBox testMB = new MathBox(intArr);
        testMap.put(testMB, 19);

        assertNotEquals(15, testMap.get(mathBox));
        assertEquals(19, testMap.get(mathBox));
    }

    @Test
    void testRemoveElement() {
        assertTrue(mathBox.getNumSet().contains(2));
        mathBox.findAndRemoveElement(2);
        assertFalse(mathBox.getNumSet().contains(2));
    }
}
