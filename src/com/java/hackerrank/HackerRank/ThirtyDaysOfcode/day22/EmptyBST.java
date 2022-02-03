package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day22;

public class EmptyBST<D extends Comparable> implements Tree<D> {
    EmptyBST() {

    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0; // if BST is empty so it's size is zero
    }

    @Override
    public boolean member(D ele) {
        return false;
    }

    @Override
    public NonEmptyBST<D> add(D ele) {
        return new NonEmptyBST<D>(ele);
    }
}
