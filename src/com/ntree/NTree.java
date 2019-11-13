package com.ntree;

import java.util.Comparator;

public class NTree<T extends Comparable<T>> {
    Node<T> root;
    int size;

    public NTree(int size) {
        this.size = size;
    }

    void addT(T value) {
        if (root == null) {
            root = new Node<>(value);
            return;
        }

        add(this.root, value);
    }

    void add(Node<T> current, T value) {
        if (current.getNodes().size() == this.size) {
            for (int i = 0; i < this.size; i++) {
                if (value.compareTo(current.getOneNode(i).getValue()) < 0) {
                    add(current.getOneNode(i), value);
                    return;
                }
            }
            add(current.getOneNode(size - 1), value);
        } else {
            current.getNodes().add(new Node<>(value));
            current.getNodes().sort(Comparator.naturalOrder());
        }
    }

    public static void main(String[] args) {
        NTree<Integer> t = new NTree<>(3);
        t.addT(10);
        t.addT(5);
        t.addT(6);
        t.addT(12);
        t.addT(1);
        t.addT(3);
        t.addT(13);
        t.addT(7);
        t.addT(8);
        t.addT(9);
        t.addT(2);
        t.addT(11);
    }
}
