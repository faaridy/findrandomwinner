package user;

import java.util.Scanner;

public class registerUser {
    
    public static void register(int n){


        createUser[] users = new createUser[n];

        for(int i = 0;i < users.length;i++){
            createUser s = new createUser();
            System.out.println(i+1 + ".Username:");
            Scanner sc1 = new Scanner(System.in);
            String name = sc1.nextLine();
            System.out.println(i+1 + ".User Surname:");

            String surname = sc1.nextLine();
            System.out.println(i+1 +".User instagram name:");
            String ig_name = sc1.nextLine();
            s.setName(name);
            s.setSurname(surname);
            s.setIg_account(ig_name);
            users[i] = s;

        }
        createUser.instance().setK(n);

    }


}
