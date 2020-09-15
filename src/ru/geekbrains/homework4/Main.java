package ru.geekbrains.homework4;

public class Main {

    public static void main(String[] args) {
        // № 1-4:
        Worker a = new Worker();

        System.out.println(
                a.getFIO());
        System.out.println(
                a.getAge());
        // № 5
        workernew[] workernew1 = new workernew[5];
        workernew1[0] = new workernew("Stepanov", 600, 45);
        workernew1[1] = new workernew("Stepanov1", 100, 36);
        workernew1[2] = new workernew("Stepanov2", 15, 52);
        workernew1[3] = new workernew("Stepanov3", 30, 27);
        workernew1[4] = new workernew("Stepanov4", 40, 48);
        for (int i = 0; i < workernew1.length; i++) {
            if (workernew1[i].getAge() > 40) {
                workernew1[i].printInfo();
            }
        }
    }
}
