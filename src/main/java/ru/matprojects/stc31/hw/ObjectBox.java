package ru.matprojects.stc31.hw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ObjectBox<T extends Object> {
    private Set<T> objects;

    public ObjectBox() {
        this.objects = new HashSet<>();
    }

    public ObjectBox(T[] objects) {
        this.objects = new HashSet(Arrays.asList(objects));
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

    public Set<T> getObjects() {
        return objects;
    }

    public void setObjects(Set<T> objects) {
        this.objects = objects;
    }
}
