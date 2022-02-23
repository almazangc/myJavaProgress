package com.almazan.Section9.Abstract.Challenge;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem root);
    void traverse(ListItem root);
}