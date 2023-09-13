package user;

import java.util.Scanner;

public class createRandomNum {
    public static void RandomNum(){
        System.out.println("Choose random number which win the game :");
        Scanner sc4 = new Scanner(System.in);
        Integer maxnum = sc4.nextInt();
        Integer randomNum = createUser.instance().getRandomNum();
        if(randomNum.equals(maxnum)){
            System.out.println("Congratulations you won!");
            System.out.println(randomNum);
        }else{
            System.out.println("YOU LOSE...");
            System.out.println(randomNum);
        }
    }
}
