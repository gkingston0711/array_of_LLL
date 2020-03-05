package com.company;

public class dinner extends Event{

    protected String host;

    public dinner(int day, String name, String TIME, String HOST){

        super(day,name,TIME);
        this.host=HOST;

    }

    public String get_host(){
        return host;
    }

    void display() {

    System.out.println(host);
    System.out.println(this.get_date());
    System.out.println(this.get_name());
    System.out.println(this.get_time());

    }

    public String change_host(String curr_host,String new_host){

        if(host==curr_host){
            host=new_host;
            return new_host;
        }
        else{
            return null;
        }

        }
}
