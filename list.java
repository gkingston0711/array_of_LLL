package com.company;


import java.util.Scanner;

public class list {//should this be private????

    private node[] head = new node[3];//does this create array of 3 head pointers

    //head[0]=dinner
    //head[1]=work
    //head[2]=fun

    list() {
        head[0] = null;
        head[1] = null;
        head[2] = null;
    }


    list(Event eve, int pick) {
        node new_node = new node(eve);
        this.head[pick] = new_node;
    }


    public void insert(Event newest, int pick) {
        if (this.head[pick] == null) {
            node new_node = new node(newest);
            this.head[pick] = new_node;
            return;
        }

        if (this.head[pick].newest_event.get_date() > newest.get_date()) {
            node new_node = new node(newest);
            new_node.next = head[pick];
            this.head[pick] = new_node;
            return;

        }
        insert(newest, head[pick]);
    }

    private void insert(Event newest, node head) {

        if (head.next == null) {

            if (head.newest_event.get_date() > newest.get_date()) {
                //before

                node new_node = new node(newest);
                new_node.next = head;
                head = new_node;
                return;

            } else {
                node new_node = new node(newest);
                head.next = new_node;
                return;
            }
        }
        if (head.newest_event.get_date() >= newest.get_date()) {
            node new_node = new node(newest);
            new_node.next = head;
            //this.head = new_node;
            //head=new_node;
            return;
        }

        if (head.newest_event.get_date() > newest.get_date()) {
            node new_node = new node(newest);
            node temp = head.next;

            new_node.next = temp;
            head.next = new_node;

            return;

        }

        insert(newest, head.next);
    }

    public void display() {
        for (int i = 0; i < 3; ++i) {
            display(head[i]);
        }
    }

    private void display(node head) {
        if (head == null) {
            return;
        } else {
            head.newest_event.display();
            display(head.next);
            return;
        }
    }


    public void display_specific(int index) {
        if (head[index] == null) {
            System.out.println("No list here");
            return;
        }


        display(head[index]);


    }

    public void change_dinner_time(String new_time, String event_name) {
        if (head[0] == null) {
            return;
        } else {
            int pick = 0;
            change_dinner_time(new_time, event_name, pick, head[pick]);


        }

    }

    private void change_dinner_time(String new_time, String event_name, int pick, node head) {
        if (head == null) {
            return;
        } else {
            if (head.newest_event.get_name() == event_name) {
                head.newest_event = null;
                head.newest_event.set_time(new_time);
                return;
            } else {
                change_dinner_time(new_time, event_name, pick, head.next);
            }
        }


    }

    public void delete_special(String d_name, int type) {

        if (head[type] == null) {
            return;
        }
        if (head[type].newest_event.get_name() == d_name) {
            head = null;
        }

        delete_special(d_name, type, head[type]);

        if (type == -1) {
            delete_special(d_name, head[type]);// example of method overloading
        }

    }

    private void delete_special(String d_name, int type, node head) {

        if (head == null) {
            return;
        } else if (d_name == head.newest_event.get_name()) {
            head = head.next;
            return;
        } else {
            delete_special(d_name, type, head.next);
        }

    }


    private void delete_special(String d_name, node head) {

        if (head == null) {
            return;
        } else if (d_name == head.newest_event.get_name()) {
            head = head.next;
            return;
        } else {
            delete_special(d_name, head.next);
        }
        return;
    }

    public int is_empty() {

        int test;
        int result;

        Scanner input = new Scanner(System.in);

        System.out.println("enter -1 to see if whole calender is empty, or type 0 for dinner, 1 for work , 2 for fun");
        test = input.nextInt();
        input.nextLine();

        if (test == -1) {
            return is_empty(head[0]);
        }
        else {
            return is_empty(head[test],test);//method overloading
        }
    }
    private int is_empty(node head) {
        if(head==null) {
        return 0;
        }
        else return 1;

    }
    private int is_empty(node head,int pick){

        if(head==null){
            return 0;
        }
        else return 1;
    }
}



