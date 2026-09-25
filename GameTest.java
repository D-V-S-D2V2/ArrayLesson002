import java.util.*;

public class GameTest{
    public static void main(String[] args){
        Scanner question = new Scanner(System.in);
        System.out.println("Pick a number.");
        int baseNum = question.nextInt();
        Coin[] purse = new Coin[baseNum];
        for(int i = 0; i <baseNum; i ++) {
            purse[i] = new Coin(1, "Silver");
        }
        // System.out.print(purse[purse.length-1]);
        
        double wealth = 0;
        for(int i = 0; i < baseNum; i ++) {
            wealth += purse [i].getValue();
        }
        System.out.println("Your purse is worth " + wealth + ".");

        purse[0] = new Coin(0.1, "copper");

        wealth = 0;
        for(int i = 0; i < baseNum; i ++) {
            wealth += purse [i].getValue();
        }
        System.out.println("Your purse is worth " + wealth + ".");
        
    }
}