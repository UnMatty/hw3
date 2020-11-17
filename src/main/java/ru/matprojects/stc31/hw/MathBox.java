package ru.matprojects.stc31.hw;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MathBox<T extends Number> extends ObjectBox {
    public MathBox(T[] arrNumber) {
        super(arrNumber);
    }

    /**
     * find sum of inner objects and return as Double value
     * @return sum in Double object
     */
    public Double summator() {
        Set<T> objects = this.getObjects();
        return objects.stream()
                .mapToDouble(Number::doubleValue)
                .reduce(Double::sum)
                .orElse(0d);
    }

    /**
     * divide all elements by split
     * @param split a divide arg
     */
    public void splitter(T split) {
        Set<Number> splittedSet = new HashSet<>(this.getObjects().size());
        for (Object object : this.getObjects()) {
            T v =(T) object;
            splittedSet.add(v.doubleValue() / split.doubleValue());
        }
        this.setObjects(splittedSet);
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
