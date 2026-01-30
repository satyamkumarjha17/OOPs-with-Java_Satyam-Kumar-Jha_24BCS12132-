/*                          ---EXPERIMENT 1---
What is Method Overloading? Write a Java program to demonstrate method 
overloading for calculating the area of different shapes.

-->Method Overloading is a concept in Java in which two or more 
   methods have the same name but different parameters in the same class.
*/


class Area {

    void area(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void area(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {

        Area obj = new Area();

        obj.area(5);
        obj.area(10, 4);
        obj.area(3.5);
    }
}
