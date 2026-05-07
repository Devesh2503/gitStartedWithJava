package com.Revision.OOPS;

public class Login {
    public static void main(String[] args) {
        User user1 = new User();

        user1.setCredentials("dev", "admin123");
        user1.login("admin123");
    }
}

class User {

    private String username;
    private String password;

    void setCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void login(String enteredPassword) {
        if (enteredPassword.equals(password)) {
            System.out.println("Login Success");
        } else {
            System.out.println("Invalid Password");
        }
    }
}