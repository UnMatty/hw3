package ru.matprojects.stc31.hw;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MathBox extends ObjectBox {
    public MathBox(Number[] arrNumber) {
        super(arrNumber);
    }

    /**
     * find sum of inner objects and return as Double value
     * @return sum in Double object
     */
    public int summator() {
        Set<Object> objects = this.getObjects();
        return objects.stream()
                .mapToInt(o -> (Integer) o)
                .reduce(Integer::sum)
                .orElse(0);
    }

    /**
     * divide all elements by split
     * @param split a divide arg
     */
    public void splitter(Number split) {
        Set<Object> objects = this.getObjects();
        objects = (objects.stream()
                .mapToInt(o -> (Integer) o)
                .map(e -> e / split.intValue())
                .mapToObj(e -> (Number) e)
                .collect(Collectors.toCollection(HashSet::new)));
        this.setObjects(objects);
    }

    public void findAndRemoveElement(Number element){
        this.deleteObject(element);
    }

    @Override
    public int hashCode() {
        Set<Object> objects = this.getObjects();
        return objects.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Set<Object> objects = this.getObjects();
        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;

        return objects.equals(((MathBox) obj).getObjects());
    }

    @Override
    public String toString() {
        return "Mathbox{"
                + this.dump()
                + "}";
    }
}
