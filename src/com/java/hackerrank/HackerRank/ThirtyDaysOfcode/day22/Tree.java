package com.java.hackerrank.HackerRank.ThirtyDaysOfcode.day22;

// D is generic type
// we must need to extend comperable because BSF follows rule Left child must be < root and right child > root, so to make check go for comperaable
public interface Tree<D extends Comparable> {
    public boolean isEmpty();

    public int cardinality(); // size of BST

    public boolean member(D ele);// data type of BST, D is generic type

    public NonEmptyBST<D> add(D d);
}
