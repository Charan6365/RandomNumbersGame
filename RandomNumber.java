import java.util.*;

public class RandomNumber{
  public static void main(String[] args){ 
      int user_number=0,won=0,lost=0;
      Random r=new Random();
      Scanner sc=new Scanner(System.in);
      System.out.println("Welcome to Guess_Random_Numbers game.\n Make sure you enter the numbers in range of 1 to 100");
  while(true)
  {
   int computer_generated_number=r.nextInt(101);
   System.out.print("Enter number : ");
   boolean flag=true,play_result=false;
   int count=0;
   while(flag)
     {
      user_number=sc.nextInt();
      if(computer_generated_number==user_number)
      {
        System.out.println("Congrats you guessed it right.");
        flag=false;
        play_result=true;
      }
      else if(computer_generated_number<user_number)
      {
        count++; 
        if(count==8)
        {
          System.out.println("Sorry,you lost the game the actual number is "+computer_generated_number+".");
          flag=false;
        }
        else
        {
          System.out.println("Guess a small number(still you have "+(8-count)+" chances)");
        }
      }
      else
      {
        count++;
        if(count==8)
        {
          System.out.println("Sorry,you lost the game the actual number is "+computer_generated_number+".");
          flag=false;
        }  
        else
        {
          System.out.println("Guess a big number(still you have "+(8-count)+" chances)");}
        }
      }
    if(play_result)
    {
      won++;
    }
    else{
      lost++;
    }
    System.out.println("Matches played="+(won+lost)+".\nMatches won="+won+".\nMatches lost="+lost+".");
    System.out.println("Want to play another game if(Yes '1':No '0'): ");
    int num=sc.nextInt();
    if(num==0)
    {
      break;
    }
  }
    sc.close();
  }
}