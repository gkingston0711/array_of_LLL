package com.company;


public class list{//should this be private????

    private node [] head=new node[3];//does this create array of 3 head pointers

    //head[0]=dinner
    //head[1]=work
    //head[2]=fun

    list(){
        head[0]=null;
        head[1]=null;
        head[2]=null;
    }


    list(Event eve,int pick){
        node new_node= new node(eve);
        this.head[pick]=new_node;
    }


    public void insert(Event newest,int pick){
        if(this.head[pick]==null){
            node new_node = new node(newest);
            this.head[pick]= new_node;
            return;
        }

       if(this.head[pick].newest_event.get_date()>newest.get_date()){
            node new_node=new node(newest);
            new_node.next=head[pick];
            this.head[pick]=new_node;
            return;

       }
        insert(newest,head[pick]);
    }

    private void insert(Event newest, node head) {

        if (head.next == null) {

            if (head.newest_event.get_date() > newest.get_date()) {
                //before

                node new_node = new node(newest);
                new_node.next = head;
                head = new_node;
                return;

            }
            else {
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

        if (head.newest_event.get_date() >newest.get_date()) {
            node new_node = new node(newest);
            node temp =head.next;

            new_node.next = temp;
            head.next = new_node;

            return;

        }

        insert(newest, head.next);
    }
    public void display() {
        for (int i=0; i < 3; ++i) {
            display(head[i]);
        }
    }
    private void display(node head) {
        if(head == null) {
            return;
        } else {
            head.newest_event.display();
            display(head.next);
            return;
        }
    }

    }


