package user;

import java.util.Random;

public class createUser {
    private String name;
    private String surname;
    private String ig_account;
    private int randomNum;
    private static createUser config = null;


    public createUser(){

    }
    public createUser(String name, String surname, String ig_account) {
        this.name = name;
        this.surname = surname;
        this.ig_account = ig_account;
    }
    public static createUser instance(){
        if(config == null){
            config = new createUser();
        }
        return config;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIg_account() {
        return ig_account;
    }

    public void setIg_account(String ig_account) {
        this.ig_account = ig_account;
    }

    @Override
    public String toString() {
        return
                name + " " + surname +" "+ ig_account;
    }

    public int getRandomNum() {
        Random ran = new Random();
        int min = 1;
        int max = randomNum;
        int randomNum = ran.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public void setK(int k) {
        this.randomNum = randomNum;
    }
}
