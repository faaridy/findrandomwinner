package menu;

import user.createRandomNum;
import user.createUser;
import user.registerUser;

import java.util.Scanner;


public class Menu {
    public static void showMenu(){
        System.out.println("Welcome to the competiton - GOOD LUCK");
         String user = "admin";
         String password1 = "admin";
         for(int i = 0;i < 3;i++) {

             Scanner sc = new Scanner(System.in);
             System.out.println("Username:");
             String username = sc.nextLine();
             System.out.println("Password:");
             String password2 = sc.nextLine();
             if (user.equals(username) && password1.equals(password2)) {
                 while (true) {
                     System.out.println("1.Register Users\n" +
                                         "2.Start Competition\n" +
                                         "3.Logout\n" +
                                         "4.Exit\n");
                     System.out.println("Choose Operation");
                     Scanner sc1 = new Scanner(System.in);
                     int num = sc1.nextInt();
                     if(num == 1){
                         System.out.println("How many user register?");
                         Scanner sc9 = new Scanner(System.in);
                            createUser.instance().setNumberofmen( sc9.nextInt());
                         registerUser.register();


                     } else if(num == 2){
                         createRandomNum.RandomNum();
                     } else if(num == 3){
                         showMenu();
                     } else if(num == 4){
                         break;
                     } else{
                         System.out.println("This operation is not available");
                     }
                 } break;
             } else {
                 if(i<2){
                     System.out.println("Username or Password is incorrect, please try again");
                 }else {
                     System.out.println("You are Banned");
                     break;
                 }
             }
         }
    }


}
