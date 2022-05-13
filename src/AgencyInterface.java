import java.util.*;

public class AgencyInterface 
{
  static Scanner console = new Scanner(System.in);
  static Couple c = new Couple();
  static Person person = new Person();

  public static void main (String[] args) 
  {
        int choice,position;
        
        showSelection();
        System.out.print("Choice: ");
        choice = console.nextInt();
        while(choice != 9)  {
            switch (choice) {
                case 1 -> addCouple();
                case 2 -> {
                    System.out.print("inform the number of the couple");
                    position = console.nextInt();
                    testCouple(position);
                }
                case 3 -> {
                    System.out.print("inform the number of the couple");
                    position = console.nextInt();
                    displayCouple(position);
                }
                case 4 -> {
                    averageAge();
                }
                case 5 ->{
                    maxDifference();
                }
                case 6 ->{
                    averageDifference();
                }
                default -> System.out.println("Invalid Selection");
            }//end switch
            showSelection();
        choice = console.nextInt();
    }
 }      
 public static void showSelection()
 {
    System.out.println("1. Add a new couple");
    System.out.println("2. Test a couple");
    System.out.println("3. Display couple");
    System.out.println("4. Calculate the average age of males and females");
    System.out.println("5. Max age difference between couples");
    System.out.println("6. Average age difference between couples");
    System.out.println("9. Exit\n");
 }
 public static void addCouple() 
 {
    String   herName,hisName;
    int    herAge,hisAge;

    System.out.print("her name: ");  herName = console.next();
    System.out.print("her age: ");   herAge= console.nextInt();
    System.out.print("his name: ");  hisName = console.next();
    System.out.print("his age: ");   hisAge= console.nextInt();
    c.addData(herName,herAge,hisName,hisAge);
 }
 public static void testCouple (int position)
 {
    System.out.println(c.test(position));           
 }
 public static void displayCouple(int position)
 {
    System.out.println(c.display(position));           
 }
 public static void averageAge(){
     System.out.println("The average age of "+c.getTotal()+" couples:");
     System.out.println("Male average: "+c.maleAverage());
     System.out.println("Female average: "+c.femaleAverage()+"\n");
 }
 public static void maxDifference(){
      System.out.println("The maximum difference of age is: "+c.getMaxDifference()+" years apart.\n");
 }
 public static void averageDifference(){
      System.out.println("The average age difference between all couples is: "+c.getAverageDifference()+"years.\n");
 }
}
