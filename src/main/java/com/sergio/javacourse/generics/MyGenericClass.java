package com.sergio.javacourse.generics;

/**
 * Edit this class to accept generics.
 * You will need to edit both methods {@code accept} and {@code returns} to use the generic instead of {@code Object}.
 * Be aware to edit inside both methods to save the given item and return it. An internal field will be needed, with
 * the Generic definition too.
 */
public class MyGenericClass<T> {

    private T value;

    public void accept(T item) {
        this.value = item;
    }

    public T returns() {
        return this.value;
    }
}
