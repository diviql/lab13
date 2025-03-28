package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Maryana!");
        Tester tester1 = new Tester();
        Tester tester2 = new Tester("Василий", "Петров", 5);
        Tester tester3 = new Tester("Владимир", "Сидоров", 10, "Продвинутый", 80000);

        tester1.work();
        tester2.work("Банковское приложение");
        tester3.work(8, "Интернет-магазин");
        Tester.companyInfo();
    }
}