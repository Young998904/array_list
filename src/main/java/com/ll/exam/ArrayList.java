package com.ll.exam;

public class ArrayList {
    int[] datum;
    int size;

    public ArrayList() {
        size = 0;
        datum = new int[2];
    }
    private void sizeUpIfFull() {
        if ( isFull() ) {
            sizeUp();
        }
    }

    private void sizeUp() {
        int[] newDatum = new int[datum.length * 2];

        for ( int i = 0; i < datum.length; i++ ) {
            newDatum[i] = datum[i];
        }

        datum = newDatum;
    }

    private boolean isFull() {
        return size == datum.length;
    }
    public int size() {
        return this.size;
    }

    public void add(int data) {
        sizeUpIfFull();
        datum[size++] = data;
    }

    public int get(int index) {
        return datum[index];
    }

    public void removeAt(int index) {
        for (int i=index; i < size-1; i++) {
            datum[i] = datum[i+1];
        }
        size --;
    }
    public int getArrayLength() {
        return datum.length;
    }
}
