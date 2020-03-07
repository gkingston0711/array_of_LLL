package com.company;
import java.util.Scanner;
import java.io.*;


public class Main{
    private static Scanner input;
    private static int option;

    public static void main(String[] args) {

        option=-1;
        input = new Scanner(System.in);
        list object=new list();

        while(option!=0) {
            System.out.println("Welcome to your daily planner please choose one of the options\n" +
                    "1:Add item to planner\n" +
                    "2:display entire planner\n" +
                    "3:display one of your activities\n" +
                    "4:change time for a dinner event\n"+
                    "5:delete item in calendar\n" +
                    "6:see if your calendar is empty\n"+
                    "0:exit this program");
            option = input.nextInt();


            if(option==1) {

                System.out.println("Which one of the events would you like to add to your calendar?\n" +
                        "1:Dinner\n" +
                        "2:work\n" +
                        "3:fun\n");
                option=input.nextInt();

                    if(option==1) {

                        int DAY;
                        String GROUP;
                        String TIME;
                        String HOST;


                        input = new Scanner(System.in);

                        System.out.println("Please enter what day your event is");
                        DAY = input.nextInt();
                        input.nextLine();

                        System.out.println("Please enter name event: ");
                        GROUP = input.nextLine();

                        System.out.println("Please enter time of event: ");
                        TIME = input.nextLine();

                        System.out.println("Please enter the hosts name: ");
                        HOST = input.nextLine();

                        dinner party = new dinner(DAY, GROUP, TIME, HOST);
                        Event new_event = (Event) party;//upcasting;

                        object.insert(party, option-1);
                    }

                    if(option==2){

                        int DAY;
                        String NAME;
                        String TIME;
                        int PRIORITY;


                        input = new Scanner(System.in);

                        System.out.println("Please enter what day your event is");
                        DAY = input.nextInt();
                        input.nextLine();

                        System.out.println("Please enter Event title: ");
                        NAME = input.nextLine();

                        System.out.println("Please enter time of event: ");
                        TIME = input.nextLine();

                        System.out.println("Please enter your priority: ");
                        PRIORITY = input.nextInt();

                        work party = new work(DAY, NAME, TIME, PRIORITY);
                        Event new_event = (Event) party;//upcasting;

                        object.insert(party,option-1);
                    }

                    if(option==3){

                        int DAY;
                        String NAME;
                        String TIME;
                        String TYPE;


                        input = new Scanner(System.in);

                        System.out.println("Please enter what day your event is");
                        DAY = input.nextInt();
                        input.nextLine();

                        System.out.println("Please enter Event title: ");
                        NAME = input.nextLine();

                        System.out.println("Please enter time of event: ");
                        TIME = input.nextLine();

                        System.out.println("Please enter the hosts name: ");
                        TYPE = input.nextLine();

                        fun party = new fun(DAY, NAME, TIME,TYPE);
                        Event new_event = (Event) party;//upcasting;

                        object.insert(party, option-1);
                    }
            }

            if(option==2){

             object.display();

            }
            if(option==3){

                System.out.println("Which would you like to print?\n"+
                        "1:Dinner\n"+
                        "2:Work\n"+
                        "3:Fun\n");

                option = input.nextInt();;

                object.display_specific(option-1);

            }
            if(option==0) {
                System.out.println("Thank you for using this program");
            }

            if(option==4){
                    String new_time;
                    String old_name;

                    System.out.println("what is the name of the event you want to change times of: ");
                    old_name=input.nextLine();
                    input.nextLine();

                    System.out.println("what is the new time of the event: ");
                    new_time=input.nextLine();

                    object.change_dinner_time(new_time,old_name);

                }
            if(option==5){

                String delete_name;
                int type;

                System.out.println("name of event you want to delete: ");
                delete_name=input.nextLine();
                input.nextLine();

                System.out.println("type 0 for dinner, 1 for work, 2 for fun");
                type=input.nextInt();


                object.delete_special(delete_name,type);

            }

            if(option==6){

                int EMPTY;

                EMPTY=object.is_empty();

                if(EMPTY==0){
                    System.out.println("YOUR LIST IS EMPTY");

                }
                else if(EMPTY==1){
                    System.out.println("YOUR LIST HAS EVENTS IN IT");
                }
            }
        }

    }
}
