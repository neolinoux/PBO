package Tugas.modul2;

public class Author {
    String name;
    String email;
    char gender;

    Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]"; 
    }
}
