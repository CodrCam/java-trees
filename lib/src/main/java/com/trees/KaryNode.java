package com.trees;


import java.util.ArrayList;

class KaryNode<A> {
    private A value;
    private ArrayList<KaryNode<A>> children;

    public KaryNode(A value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }

    public ArrayList<KaryNode<A>> getChildren() {
        return children;
    }

    public void addChild(KaryNode<A> child) {
        children.add(child);
    }
}
