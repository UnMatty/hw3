package ru.matprojects.stc31.hw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ObjectBox {
    private Set<Object> objects;

    public ObjectBox() {
        this.objects = new HashSet<>();
    }

    public ObjectBox(Object[] objects) {
        this.objects = new HashSet(Arrays.asList(objects));
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

    public Set<Object> getObjects() {
        return objects;
    }

    public void setObjects(Set<Object> objects) {
        this.objects = objects;
    }
}
