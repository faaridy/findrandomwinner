package user;

import java.util.Scanner;

public class registerUser {



    public static createUser[] users = new createUser[createUser.instance().getNumberofmen()];
    public static void register(){

        for(int i = 0;i < users.length;i++){
            createUser s = new createUser();
            System.out.println(i+1 + ".User name:");
            Scanner sc1 = new Scanner(System.in);
            String name = sc1.nextLine();
            System.out.println(i+1 + ".User surname:");

            String surname = sc1.nextLine();
            System.out.println(i+1 +".User instagram name:");
            String ig_name = sc1.nextLine();
            s.setName(name);
            s.setSurname(surname);
            s.setIg_account(ig_name);
            users[i] = s;

        }
        createUser.instance().setRandomNum(createUser.instance().getNumberofmen());

    }


}
