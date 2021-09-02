package com.syntax.class23Tasks;

public class PrivateOverLoadTask5 {
//TASK5

    private void overL(int num1, int num2, int num3) {
        System.out.println("The sum of numbers is" + (num1 + num2+num3));
    }
    private void overL(double num1, int num2) {
        System.out.println("The difference of numbers is" + (num1 - num2));
    }

    private void overL (String a , int num3, double num4 ) {

        System.out.println("The "+ a + "is " + (num3 + num4));

    }

    public static void main(String[] args) {
PrivateOverLoadTask5 enes= new PrivateOverLoadTask5();
        enes.overL(4,5,6);
        enes.overL(6,3);
        enes.overL("THE TOTAL  ",5,6);


    }
}
