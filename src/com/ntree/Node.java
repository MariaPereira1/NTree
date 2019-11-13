package com.ntree;

import java.util.ArrayList;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
    private T value;
    private ArrayList<Node<T>> Nodes;

    public Node(T value) {
        this.value = value;
        this.Nodes = new ArrayList<>();
    }

    public T getValue() {
        return value;
    }

    public Node<T> getOneNode(int index) {
        return Nodes.get(index);
    }

    public ArrayList<Node<T>> getNodes() {
        return Nodes;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNodes(Node<T> node) {
        Nodes.add(node);
    }

    @Override
    public int compareTo(Node<T> o) {
        return this.value.compareTo(o.getValue());
    }
}
