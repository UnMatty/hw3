package ru.matprojects.stc31.hw;

import java.util.HashSet;
import java.util.Set;

public class ObjectBox<T extends Object> {
    private Set<T> objects;

    public ObjectBox() {
        this.objects = new HashSet<>();
    }

    public void addObject(T obj) {
        objects.add(obj);
    }

    public void deleteObject(T obj) {
        objects.remove(obj);
    }

    public String dump() {
        return objects.toString();
    }
}
