package ru.geekbrains.homework4;
// №1
public class Worker {
    private String FIO;
    private int salary;
    private int age;
// №2
    public Worker(){
        FIO = "Селиванов Алексей Янович";
        salary = 200000;
        age = 30;
    }
// №3,4
    public String getFIO (){
        return FIO;
    }
    public int getSalary(){
        return salary;
    }

    public int getAge() {
        return age;
    }
}

