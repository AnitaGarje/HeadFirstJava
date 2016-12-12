package Ch5ExtraStrengthMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Annu
 */
public class Game {
     List setdotcom=new ArrayList();
     Scanner input=new Scanner(System.in);
      int guessnum,numOfHits=0,triedcnt=0,temp=0,enter=-1;
    void SetDotom(){
        System.out.println("Enter the number between 0-6 to set dotCom:");
       for(int i=0;i<3;i++)
        {   
            setdotcom.add(input.nextInt());
            /*enter=input.nextInt();
            if(temp==enter)
            {
                  System.out.println("Enter another number between 0-7 to set dotCom:");
                  enter=input.nextInt();
                  
            }
            else
            {
                setdotcom.add(enter);
                temp=enter;
            }*/
          
        }
    }
    
    void play()
    {
       
        while(numOfHits<3)
        {
            triedcnt++;
            System.out.println("Guess the number between 0-6:");
            
            guessnum=input.nextInt();
            if(guessnum==temp)
            {
                System.out.println("Enter Other number same number is already guessed by you !!!");
            }
            else
            {
                if(setdotcom.contains(guessnum))
                {
                    numOfHits++;
                    System.out.println("hit");
                }

                else
                {
                    System.out.println("miss");
                }
            }
            temp=guessnum;
                
            
        }
        if(numOfHits==3)
            {
                System.out.println("kill");
                System.out.println("You tried "+ triedcnt +" times");
            }
        

      
    }
}
