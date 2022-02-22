package com.almazan.Section9.Interface;

import java.util.Arrays;

/**
 * Interface is like a signature or a blueprint for building something
 */
interface parts{
    String[] head = {"HAIR","EYES","NOSE","MOUTH","EAR"};
    public void build();
}

public class Interface implements parts {
    public static void main(String[] args) {
        Interface headPart = new Interface();
        headPart.build();
    }

    @Override
    public void build(){
        System.out.println(Arrays.stream(head).toList());
        System.out.println("Build Successful");
    }
}
