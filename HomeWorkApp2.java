package ru.geekbrains;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println("1. Написать метод, принимающий на вход два целых числа и проверяющий, " +
                            "что их сумма лежит в пределах от 10 до 20 (включительно)," +
                            " если да – вернуть true, в противном случае – false.");
        System.out.println(rangeOfNumbers(10,5));
        System.out.println(rangeOfNumbers(20,1));
        System.out.println(rangeOfNumbers(20,0));
        System.out.println("2. Написать метод, которому в качестве параметра передается целое число," +
                            " метод должен напечатать в консоль, положительное ли число передали" +
                            " или отрицательное. Замечание: ноль считаем положительным числом.");
        printNumber(+ 8);
        printNumber(-8);
        printNumber(+ 0);
        System.out.println("3. Написать метод, которому в качестве параметра передается целое число. " +
                            "Метод должен вернуть true, если число отрицательное," +
                            " и вернуть false если положительное.");
        System.out.println(printBoolNumber(4));
        System.out.println(printBoolNumber(0));
        System.out.println(printBoolNumber(-1));
        System.out.println("4. Написать метод, которому в качестве аргументов передается строка" +
                            " и число, метод должен отпечатать в консоль " +
                            "указанную строку, указанное количество раз;");
        printString("Я люблю Java",5);
        System.out.println("5. * Написать метод, который определяет, является ли год високосным," +
                                " и возвращает boolean (високосный - true, не високосный - false)." +
                                " Каждый 4-й год является високосным, кроме каждого 100-го," +
                                " при этом каждый 400-й – високосный.");
        int[] years = {2017,2000,2010,2016};
            for(int year: years){
                System.out.println(detectLeapYear(year));
            }
    }

    public static boolean rangeOfNumbers(int a, int b){

        if (a + b > 10 && a + b <= 20 ){
            return true;
        } else {
            return false;
        }

    }
    public static void printNumber(int a){
       if(a>=0){
           System.out.println("Число положительно: " + a);
       } else {
           System.out.println("Число отрицательное: " + a);
       }
    }
    public static boolean printBoolNumber(int a){
        if (a >= 0){
            return false;
        }else {
            return true;
        }
    }
    public static void printString(String s, int a){
        for (int i=0; i <a; i++){
            System.out.println(s);
        }
    }
    public static boolean detectLeapYear(int year){
        boolean leap;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    leap = true; //Год високосный ;
                } else {
                    leap = false;//Год невисокосный относится к if (year % 400 == 0);
                }

            } else {
                leap = true;//Год високосный относится к if (year % 100 == 0);
            }
        } else {
            leap = false;//Год невисокосный относится к  if (year % 4 == 0);
        }
       return leap;
    }
}
