package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //Задача 1:
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        //Задача 2:
        String upperfullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperfullName);

        //Задача 3 вариант 1:
        fullName = lastName + ";" + firstName + ";" + middleName;
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName);
        // вариант 2:
        fullName = fullName.replace(" ", ";");   //    (' ', ';' );
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName);

        fullName = "Иванов Семён Семёнович";
        String optionfullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + optionfullName);

    }
}

