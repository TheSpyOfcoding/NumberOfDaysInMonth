package com.fulalsayabprojects;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(4, 1000000));
        System.out.println(getDaysInMonth(2, 1996));

    }

    public static boolean isLeapYear(int year) {
        if ((year > 0) && (year < 10000)) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                }
                return true;
            }

        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month > 0) && (month < 13)) {
            if ((year > 0) && (year < 10000)) {

                int days = 0;
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        days = 31;
                        break;
                    case 2:
                        boolean leap = isLeapYear(year);
                        if (leap) {
                            days = 29;
                        } else {
                            days = 28;
                        }
                        break;
                    default:
                        days = 30;

                }
                return days;
            }
        }

            return -1;

    }
}



