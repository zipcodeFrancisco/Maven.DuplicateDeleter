package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);


    public T[] remDup(T[] output, int maxNumberOfDuplications){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (countDuplicates(array[i]) < maxNumberOfDuplications ){
                output[counter++] = array[i];
            }
        }
        return Arrays.copyOf(output,counter);
    }

    public T[] remDupExa(T[] output, int maxNumberOfDuplications){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (countDuplicates(array[i]) != maxNumberOfDuplications ){
                output[counter++] = array[i];
            }
        }
        return Arrays.copyOf(output,counter);
    }

    public int countDuplicates(T value){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == value){
                counter++;
            }
        }
        return counter;
    }

}
