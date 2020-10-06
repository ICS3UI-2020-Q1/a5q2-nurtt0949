import java.util.Scanner;
/**
 *Counts to users number
 * @author Tolga Nurtekin
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a Scanner
    Scanner input = new Scanner(System.in);
    //ask user for integer
    System.out.println("Please enter a positive integer");
    //declare a variable to store integer
    int integer = input.nextInt();
    //create a loop that counts up to users number
    for(int count = 1; count <= integer; count++ ){
     if(count == integer){
       System.out.print(integer);
     }else if(count < integer){ 
       System.out.print(count + ",");
     }
    } 
    
  }
}
