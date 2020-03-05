package com.company;

public class work extends Event{

    int priority;

    public work(int day,String NAME,String TIME,int PRIORITY){

        super (day,NAME,TIME);
        this.priority=PRIORITY;
    }

    public int get_priority(){
        return priority;
    }

    void display() {
        System.out.println(get_priority());
        System.out.println(this.get_date());
        System.out.println(this.get_name());
        System.out.println(this.get_time());

    }

    public int change_priority(int old_priority,int new_priority){
        if(priority==old_priority){
            priority=new_priority;
            return priority;
        }
        else{
            return 0;
        }
    }
}

