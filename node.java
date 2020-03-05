package com.company;


public class node {
    //protected int date;
    protected node next;
    protected Event newest_event;

    public node(Event one) {
        this.next=null;
        newest_event=one;
    }
}
