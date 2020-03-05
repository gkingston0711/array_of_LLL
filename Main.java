package com.company;
import java.util.Scanner;
import java.io.*;



public class Main {

    public static int display_main_menu(){
        int pick=-1;

        input = new Scanner(System.in);

        System.out.println("Welcome to your daily planner please choose one of the options\n"+
                "1:Add item to planner\n"+
                "2:display entire planner\n"+
                "3:display one of your activities\n");

        pick = input.nextInt();
        return pick;
    }

    public static int display_add_menu(){

        int new_pick=-1;

        input = new Scanner(System.in);

        System.out.println("Hello user, which one of the events would you like to add to your calendar?\n" +
                "1:Dinner\n" +
                "2:work\n" +
                "3:fun\n");

        new_pick=input.nextInt();
        return new_pick;
    }

    public static int process_option(int option){
        int pick=-1;

        switch(option){
            case 1:
                pick=display_add_menu();
            case 2:

            case 3:

            default:break;
        }
        return 0;
    }




    private static Scanner input;
    private static int pick;

    public static void main(String[] args) {

/*
        int test=display_main_menu();

        if(test==1) {
            int test2 = process_option(test);
        }
*/
            list object=new list();


        dinner party=new dinner(5,"me, jake, D","7 pm","jake");
        Event new_event = (Event) party;//upcasting

        dinner party1=new dinner(9,"annie, maurnet","6 pm","annie");
        Event new_event1 = (Event) party1;//upcasting

        dinner party2=new dinner(5,"me, jake, Daniel","7 pm","Zelda");
        Event new_event2 = (Event) party2;//upcasting

        dinner party3=new dinner(9,"annie, maurnet","6 pm","Shmee");
        Event new_event3 = (Event) party3;//upcasting

        dinner party4=new dinner(20,"zzzzzzzzzzzzzzzz","TEST TEST","NEEEEWWWW");
        Event new_event4 =(Event) party4;//upcasting
        object.insert(party,2);
        object.insert(party1,2);
        object.insert(party2,2);
        object.insert(party3,2);
        System.out.println("TEST ARRAY 0 IS BELOW**********************");
        object.insert(party4,0);
        object.insert(party1,0);
        object.insert(party2,0);
        object.insert(party3,0);

        input = new Scanner(System.in);
        System.out.println("Hello user, which one of the events would you like to add to your calendar?\n" +
                "1:Dinner\n" + "2:work\n" + "3:fun\n");
        pick = input.nextInt();

        System.out.println("your pick is: "+pick);






       /*
        input = new Scanner(System.in);
        System.out.print("please enter your full name: ");
        this.name = input.nextLine();
        System.out.print("please enter your age:");
        this.age = input.nextInt();
        input.nextLine();  //line cin.ignore up until a new line
        System.out.print("please enter your wage");
        this.wage = input.nextFloat();
        input.nextLine();
        */



        //work thing=new work(20,"call","noon",10);

        //fun b_day=new fun(1,"my birthday","4PM","birthday");

        //b_day.display();

        //thing.display();

        //party.display();

        object.display();
    }
}
