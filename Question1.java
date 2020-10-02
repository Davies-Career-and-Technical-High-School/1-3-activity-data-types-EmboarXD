

import java.util.*;
import java.lang.reflect.Array;
//import java.io.*;

class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two doubles: ");
    String[] doubles = scan.nextLine().split(" ");
    for (int i = 0; i < 2; i++){
      Object adouble = Array.get(doubles, 1-i);
      System.out.print(adouble + " ");
    }
  }
}
