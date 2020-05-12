package israelontanilla.es.formdaggermvpexample.Form.Data;

public class User {
    String name;
    String lastName;
    int age;
    int number;

    public User(String name, String lastName, int age, int number) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
