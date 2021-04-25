import java.util.ArrayList;
import java.util.Scanner;







public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number: ");
    int limit = in.nextInt();
    ArrayList<Integer> numberList = new ArrayList<>();
    
  
    int num = 0;
    int count = 0;
    int tries = 0;
    while (tries < limit){
      System.out.print("Enter Number: ");
      int number = in.nextInt();
      numberList.add(number);
      tries++;
    }
    
    for(int check = 0; check < numberList.size()  ; check++){
      int cknum = numberList.get(check);
      int ckcount = 0;
      for(int check2 = 0; check2 < numberList.size(); check2++){
        if(numberList.get(check2) == cknum){
          ckcount++;
        }
      }
      if(ckcount > count){
        num = cknum;
        count = ckcount;
      }
      
    }
    System.out.println(num);
    
    
  }
}
