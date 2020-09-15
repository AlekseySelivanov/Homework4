package ru.geekbrains.homework4;

public class workernew {
    private String fio;
    private int age;
    private int salary;




    public int getAge() {
        return age;
    }

    public workernew(String fio, int salary, int age) {
        this.fio = fio;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("fio "+fio+"salary"+salary+"age "+age);
    }
}

