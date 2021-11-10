package com.luxoft.datastructures.list;

public class DoubleLinkedList implements List {

    Node head;
    Node tail;
    int size;

    @Override
    public void add(Object value) {
        add(value, size);
    }

    @Override
    public void add(Object value, int index) {
        checkNull(value);
        checkMaxSize(index);

        Node newNode = new Node(value);
        if (size == 0) {
            head = tail = newNode;
        } else if (index == size - 1) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else if (index == 0) {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    private void checkNull(Object value) {
        if(value == null){
            throw  new NullPointerException("Null element in value");
        }
    }

    private void checkMaxSize(int index) {
        if(index >= size) {
            throw new IndexOutOfBoundsException("Index "+ index + " more than size ArrayList");
        }
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(Object value, int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object value) {
        checkNull(value);
        return indexOf(value) != -1;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object value) {
        return 0;
    }
}