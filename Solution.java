import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal1{
    void walk()
    {
        System.out.println("I am walking");
    }
}
class Bird1 extends Animal1
{
    void fly()
    {
        System.out.println("I am flying");
    }
    void sing()
    {
        System.out.println("I am singing");
    }
}


public class Solution{

    public static void main(String args[]){

        Bird1 bird = new Bird1();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}