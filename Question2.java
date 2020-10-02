

import java.util.*;
import java.lang.reflect.Array;
//import java.io.*;

class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Hi there, what is your name? ");
    String name = scan.nextLine();
    System.out.println("Hi " + name + ". How old are you?");
    int age = scan.nextInt();
    System.out.println(name + " is " + age + " years old.");
    /*for (int i = 0; i < 2; i++){
      Object adouble = Array.get(doubles, 1-i);
      System.out.print(adouble + " ");
      }
      */
    
  }
}
