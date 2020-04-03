import java.util.Scanner;

public class Deputy extends Person {
    String name;
    String surname;
    int age;
    boolean isBribeTaker;
    int sizeOfBribe;


    public Deputy(String name, String surname, int age, boolean isBribeTaker) {
        this.age = age;
        this.isBribeTaker = isBribeTaker;
        this.name = name;
        this.surname = surname;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribeTaker() {
        return isBribeTaker;
    }

    public void setBribeTaker(boolean bribeTaker) {
        isBribeTaker = bribeTaker;
    }

    public int getSizeOfBribe() {
        return sizeOfBribe;
    }

    public void setSizeOfBribe(int sizeOfBribe) {
        this.sizeOfBribe = sizeOfBribe;
    }

    @Override
    public String toString() {
        return "Депутат" +  name + " " + surname + ", Вік: " + age + " років " + (isBribeTaker ? " " : "не ") + " бере взятки" ;
    }

    public void giveBribe() {
        if (isBribeTaker) {
            System.out.println("Розмір хабаря");
            Scanner scanner = new Scanner(System.in);
            int bribeSize = scanner.nextInt();
            if (bribeSize > 5000) {
                System.out.println("Поліція спіймає");
            } else if (bribeSize < 5000) {
                System.out.println("Дупутату вканало");
            }
        } else {
            System.out.println("Депутат не бере хабарів");


        }
    }
}
