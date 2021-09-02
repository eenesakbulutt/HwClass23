package com.syntax.class23Tasks;

public class Circle extends Shape{

Circle(double radius){
    super(radius);
}


    void calculateArea(){


        double calculateArea= (22/7)* radius*radius;
        System.out.println("The area of the circle is "+ calculateArea);

        // System.out.println(Math.PI*Math.pow(radius,5));
        //bu da matematiksel kullanimi bunlari da ogrenmekte fayda var.
    }


}
