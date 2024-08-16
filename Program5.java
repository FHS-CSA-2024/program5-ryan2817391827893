//import stuff here?
import java.util.Scanner;
//Your code here
public class Program5{
public static void main(String[] args){
    int gallons = 0;
    int miles = 0;
    double mpg = 0;
    
    miles = 286;
    gallons = 9;
    mpg = (double)miles/gallons;
    if(((int)(10*mpg))<((int)(10*mpg+.5)))
    {
        //round up
        mpg = (int)(mpg*10+1);
        mpg = (double)(mpg/10.0);
    }
    else
    {
        //round down
        mpg = (int)(mpg*10);
        mpg = (double)(mpg/10.0);
    }
    
    System.out.println("Royale averaged " +mpg+ " mpg");
    
    
    miles = 412;
    gallons = 40;
    mpg = (double)miles/gallons;
    if(((int)(10*mpg))<((int)(10*mpg+.5)))
    {
        //round up
        mpg = (int)(mpg*10+1);
        mpg = (double)(mpg/10.0);
    }
    else
    {
        //round down
        mpg = (int)(mpg*10);
        mpg = (double)(mpg/10.0);
    }
    
    System.out.println("koopa king averaged " +mpg+ " mpg");
    
    miles = 361;
    gallons = 18;
    mpg = (double)miles/gallons;
    if(((int)(10*mpg))<((int)(10*mpg+.5)))
    {
        //round up
        mpg = (int)(mpg*10+1);
        mpg = (double)(mpg/10.0);
    }
    else
    {
        //round down
        mpg = (int)(mpg*10);
        mpg = (double)(mpg/10.0);
    }
    
    System.out.println("pipe frame averaged " +mpg+ " mpg");    
    
    
    miles = 161;
    gallons = 11;
    mpg = (double)miles/gallons;
    if(((int)(10*mpg))<((int)(10*mpg+.5)))
    {
        //round up
        mpg = (int)(mpg*10+1);
        mpg = (double)(mpg/10.0);
    }
    else
    {
        //round down
        mpg = (int)(mpg*10);
        mpg = (double)(mpg/10.0);
    }
    
    System.out.println("Badwagon averaged " +mpg+ " mpg");
}
}
//Paste console output below:
/*
Royale averaged 31.8 mpg
koopa king averaged 10.3 mpg
pipe frame averaged 20.1 mpg
Badwagon averaged 14.6 mpg

*/
