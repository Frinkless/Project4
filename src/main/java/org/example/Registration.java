package org.example;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Please provide a Yahoo email.");
        }
    }

    public void setUserName(String userName) {
        if (userName != null && !userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid userName. UserName can not be empty and should be longer than 6 characters.");
        }
    }

    public void setPassword(String password) {
        if (password != null && !password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. Password can not be empty, should be longer than 6 characters, should not contain userName.");
        }
    }

    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("example@yahoo.com");
        registration.setUserName("exampleUser");
        registration.setPassword("examplePassword");

    }
}
