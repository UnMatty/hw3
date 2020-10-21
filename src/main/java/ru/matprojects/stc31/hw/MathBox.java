package ru.matprojects.stc31.hw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MathBox {
    private Set<Number> numSet;

    public MathBox(Number[] arrNumber) {
        numSet = new HashSet(Arrays.asList(arrNumber));
    }

    /**
     * find sum of inner objects and return as Double value
     * @return sum in Double object
     */
    public Double summator() {
        return numSet.stream()
                .mapToDouble(Number::doubleValue)
                .reduce(Double::sum)
                .orElse(0d);
    }

    /**
     * divide all elements by split
     * @param split a divide arg
     */
    public void splitter(Number split) {
        numSet = numSet.stream()
                .mapToDouble(Number::doubleValue)
                .map(e -> e / split.doubleValue())
                .mapToObj(e -> (Number) e)
                .collect(Collectors.toCollection(HashSet::new));
    }

    public Set<Number> getNumSet() {
        return numSet;
    }

    public void findAndRemoveElement(Number element){
        numSet.remove(element);
    }

    @Override
    public int hashCode() {
        return numSet.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass())
            return false;

        return this.getNumSet().equals(((MathBox) obj).getNumSet());
    }

    @Override
    public String toString() {
        return "Mathbox{"
                + numSet
                + "}";
    }
}
