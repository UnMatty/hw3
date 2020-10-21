package ru.matprojects.stc31.hw.hw3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.matprojects.stc31.hw.ObjectBox;

class ObjectBoxTests {
    private ObjectBox object;

    @BeforeEach
    void setUp() {
        object = new ObjectBox();
    }

    @Test
    void dumpTest() {
        System.out.println(object.dump());
    }

    @Test
    void addTest() {
        object.addObject("14");
        System.out.println(object.dump());
    }

    @Test
    void removeTest() {
        object.addObject("15");
        object.addObject(25);
        object.addObject(13.354);

        System.out.println(object.dump());
        object.deleteObject(25);

        System.out.println(object.dump());
    }
}
