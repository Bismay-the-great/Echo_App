package User;

import Car.Car;

import java.util.Date;
import java.util.Objects;

public class User {

    String Name;
    String Surname;
    Car UserCar;
    private String Email;
    private String Password;

    public User() {
    }

    public User(String name, String surname) {
        Name = name;
        Surname = surname;
    }

    public User(String name, String surname, String email, String password) {
        Name = name;
        Surname = surname;
        Email = email;
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Name.equals(user.Name) && Surname.equals(user.Surname) && Email.equals(user.Email) && Password.equals(user.Password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Surname, Email, Password);
    }



    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }


}




