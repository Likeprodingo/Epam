package com.core.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskController {
    public static void menuCircle() throws IOException {
        String choice = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (!choice.equals("0")) {
            try {
                System.out.println("Task number (1-10)/ 0 - Exit: ");
                choice = reader.readLine();
                switch (choice) {
                    case "1":
                        task1(reader);
                        break;
                    case "2":
                        task2(reader);
                        break;
                    case "3":
                        task3(reader);
                        break;
                    case "4":
                        task4(reader);
                        break;
                    case "5":
                        task5(reader);
                        break;
                    case "6":
                        task6(reader);
                        break;
                    case "7":
                        task7(reader);
                        break;
                    case "8":
                        task8(reader);
                        break;
                    case "9":
                        task9(reader);
                        break;
                    case "10":
                        task10(reader);
                        break;
                    case "0":
                        System.out.println("Exit");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Wrong input");
            }
        }
        reader.close();
    }

    private static <T> boolean isInArray(T variable, T[] array) {
        int size = array.length - 1;
        for (int i = 0; i <= size; i++) {
            if (array[i].equals(variable) || array[size - i].equals(variable)) {
                return true;
            }
        }
        return false;
    }

    private static void task10(BufferedReader reader) throws IOException {
        double a;
        double b;
        double h;
        double fx;
        try {
            System.out.println("Enter a, b, h:");
            a = Double.parseDouble(reader.readLine());
            b = Double.parseDouble(reader.readLine());
            h = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            throw new IOException();
        }
        for (double x = a; x <= b; x+=h) {
            fx  = Math.tan(x);
            System.out.println(x + " : " + fx);
        }
    }

    private static void task9(BufferedReader reader) throws IOException {
        double radius;
        final double PI = 3.1415926;
        try {
            System.out.println("Enter numeric:");
            radius = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            throw new IOException();
        }
        if (radius < 0) {
            throw new IOException();
        }
        System.out.println("Area: " + radius * radius * PI + ";\nLength: " + radius * 2 * PI + ";");
    }

    private static void task8(BufferedReader reader) throws IOException {
        double x;
        double result;
        try {
            System.out.println("Enter x:");
            x = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            throw new IOException();
        }
        try {
            if (x >= 3) {
                result = -x * x + 3 * x + 9;
            } else {

                result = 1 / (x * x * x - 6);
            }
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Infinity");
        }

    }

    private static void task7(BufferedReader reader) throws IOException {
        double x1;
        double y1;
        double x2;
        double y2;
        try {
            System.out.println("Enter x1, y1:");
            x1 = Double.parseDouble(reader.readLine());
            y1 = Double.parseDouble(reader.readLine());
            System.out.println("Enter x2, y2:");
            x2 = Double.parseDouble(reader.readLine());
            y2 = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException e) {
            throw new IOException();
        }
        System.out.println(Math.sqrt(x1*x1 + y1*y1)>Math.sqrt(x2*x2 + y2*y2) ? "Second point" : "First point");
    }

    private static void task6(BufferedReader reader) throws IOException {
        int seconds;
        int daylength = 86400;
        try {
            System.out.println("Enter number of seconds:");
            seconds = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            throw new IOException();
        }
        if (seconds > daylength) {
            throw new IOException();
        }
        System.out.println(seconds / 3600 + ":" + (seconds / 60) % 60 + ":" + seconds % 60);
    }

    private static void task5(BufferedReader reader) throws IOException {
        int num;
        int sum = 0;
        try {
            System.out.println("Enter numeric:");
            num = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            throw new IOException();
        }
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum == num);
    }

    private static void task4(BufferedReader reader) throws IOException {
        int massLength = 4;
        int[] massive = new int[massLength];
        int count = 0;

        for (int i = 0; i < massLength; i++) {
            try {
                System.out.println("Enter numeric:");
                massive[i] = Integer.parseInt(reader.readLine());
                if (massive[i] % 2 == 0) {
                    count++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong input");
                i--;
            }
        }
        System.out.println(count > 1);
    }

    private static void task3(BufferedReader reader) throws IOException {
        double squadArea;
        System.out.println("Enter squad area: ");
        try {
            squadArea = Double.parseDouble(reader.readLine());
            System.out.println("The area of the inscribed square is half of described: " + squadArea / 2);
        } catch (NumberFormatException e) {
            throw new IOException();
        }
    }

    private static void task2(BufferedReader reader) throws IOException {
        String month;
        int year;
        String[] thirtyDayMonthes = {"4", "6", "9", "11", "april", "june", "september", "november"};
        String[] thirtyOneDayMonthes = {"1", "3", "5", "7", "8", "10", "12", "january", "march", "may", "july", "august", "october", "december"};
        try {
            System.out.println("Enter month(1/january): ");
            month = reader.readLine();
            System.out.println("Enter year(2000): ");
            year = Integer.parseInt(reader.readLine());
            if (year < 0) {
                throw new IOException();
            }
            month = month.toLowerCase();
            if (isInArray(month, thirtyDayMonthes)) {
                System.out.println("Month has 30 days");
            } else if (isInArray(month, thirtyOneDayMonthes)) {
                System.out.println("Month has 31 days");
            } else if (month.equals("february") || month.equals("2")) {
                if (year % 4 == 0) {
                    System.out.println("Month has 29 days");
                } else {
                    System.out.println("Month has 28 days");
                }
            } else {
                throw new IOException();
            }
        } catch (NumberFormatException e) {
            throw new IOException();
        }
    }

    private static void task1(BufferedReader reader) throws IOException {
        String number;
        System.out.println("Enter your number: ");
        number = reader.readLine();
        try {
            Double.parseDouble(number);
        } catch (NumberFormatException e) {
            throw new IOException();
        }
        switch (number.charAt(number.length() - 1)) {
            case '1':
            case '9':
                System.out.println("1");
                break;
            case '2':
            case '8':
                System.out.println("4");
                break;
            case '3':
            case '7':
                System.out.println("9");
                break;
            case '4':
            case '6':
                System.out.println("6");
                break;
            case '5':
                System.out.println("5");
                break;
        }
    }
}
