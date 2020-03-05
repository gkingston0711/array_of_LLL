package com.company;

public class fun extends Event{

    String type;

    public fun(int day, String NAME, String TIME,String TYPE) {
        super(day, NAME, TIME);
        this.type=TYPE;
    }

    public String get_type(){
        return type;
    }

    void display() {

        System.out.println(type);
        System.out.println(this.get_date());
        System.out.println(this.get_name());
        System.out.println(this.get_time());
    }


    public String change_type(String curr_type,String new_type){

        if(type==curr_type){
            type=new_type;
            return new_type;
        }
        else{
            return null;
        }

    }
}
