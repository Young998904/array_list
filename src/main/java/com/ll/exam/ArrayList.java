package com.ll.exam;

public class ArrayList {
    int[] datum = new int[3];
    int size;
    public int size() {
        return this.size;
    }

    public void add(int data) {
        datum[size++] = data;
    }

    public int get(int index) {
        return datum[index];
    }
}
