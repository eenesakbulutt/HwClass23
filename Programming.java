package com.syntax.class23Tasks;

public class Programming {
//TASK3

Programming(){
    System.out.println("I love programming languages");

}
Programming(String word){
       System.out.println("I love " + word) ;



   }

    public static void main(String[] args) {

    new Programming();
    new Programming("Phyton");

//new Programming(1); error because no matching constructor.


    }



}
