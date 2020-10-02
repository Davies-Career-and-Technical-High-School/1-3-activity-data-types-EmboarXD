import java.util.*;
import java.lang.reflect.Array;

class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    List guesses = new ArrayList();
    List answers = new ArrayList();
    answers.add(true);
    answers.add(false);
    answers.add(true);

    System.out.println("Java is a programming language, true or false?");
    guesses.add(scan.nextBoolean());
    System.out.println("Only numbers can be stored by variables in Java, true or false?");
    guesses.add(scan.nextBoolean());
    System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");
    guesses.add(scan.nextBoolean());

    for (int i = 0; i < 3; i++){
      Object guess = guesses.get(i);
      Object answer = answers.get(i);
      System.out.println("Question " + (i+1) + " - Your answer: " + guess + ". Correct answer: " + answer);
    }
  }
}
