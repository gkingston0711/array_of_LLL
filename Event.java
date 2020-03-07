package com.company;

abstract class Event{

   protected int event_date;
   protected String event_time;
   protected String name;


   public Event(int day,String NAME,String TIME){

      this.event_date=day;
      this.name=NAME;
      this.event_time=TIME;
   }
   public void set_event(int day, String NAME, String time){
      this.event_date=day;
      this.name=NAME;
      this.event_time=time;
   }

   public void set_time(String value){
      event_time=value;

   }
   public int get_date(){
      return this.event_date;
   }

   public String get_name(){
      return this.name;
   }

   public String get_time(){
      return this.event_time;
   }

   abstract void display();


}
