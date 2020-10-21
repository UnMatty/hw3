package ru.matprojects.stc31.hw;

import java.util.HashSet;
import java.util.Set;

public class ObjectBox {
    private Set<Object> objects;

    public ObjectBox() {
        this.objects = new HashSet<>();
    }

    public void addObject(Object obj) {
        objects.add(obj);
    }

    public void deleteObject(Object obj) {
        objects.remove(obj);
    }

    public String dump() {
        return objects.toString();
    }
}
