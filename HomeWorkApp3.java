import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        System.out.println("1. Задать целочисленный массив, состоящий из элементов 0 и 1. " +
                        "Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. " +
                        "С помощью цикла и условия заменить 0 на 1, 1 на 0;");
        changeArray();
        System.out.println();
        System.out.println("2. Задать пустой целочисленный массив длиной 100. " +
                        "С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;");
        array100();
        System.out.println();
        System.out.println("3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] " +
                        "пройти по нему циклом, и числа меньшие 6 умножить на 2;");
        System.out.println(Arrays.toString(array3()));
        System.out.println();
        System.out.println("4. Создать квадратный двумерный целочисленный массив " +
                        "(количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить " +
                        "его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). " +
                        "Определить элементы одной из диагоналей можно по следующему принципу: " +
                        "индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];");

        deepArray(5);
        System.out.println();
        System.out.println("5. Написать метод, принимающий на вход два аргумента: len и initialValue, " +
                        "и возвращающий одномерный массив типа int длиной len, " +
                        "каждая ячейка которого равна initialValue;");
        System.out.println(Arrays.toString(array111(5,8)));
        System.out.println();
        System.out.println("6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;");
        maxAndMinArray(8);
        System.out.println();
        System.out.println("7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, " +
                            "метод должен вернуть true, если в массиве есть место, " +
                            "в котором сумма левой и правой части массива равны.");
        int[] x = {1, 2, 5, 0, 1};
        int[] y = {3, 3, 3};
        System.out.println("Равны ли суммы двух массивов? - " + sumArray(x,y));
        System.out.println();
        System.out.println("8. *** Написать метод, которому на вход подается одномерный массив и число n " +
                            "(может быть положительным, или отрицательным), при этом метод должен " +
                            "сместить все элементы массива на n позиций. Элементы смещаются циклично. " +
                            "Для усложнения задачи нельзя пользоваться вспомогательными массивами. " +
                            "Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> " +
                            "[ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. " +
                            "При каком n в какую сторону сдвиг можете выбирать сами.");
        int[] a = {1, 2, 3, 4};
        changArray(a,2);

    }

    public static void changeArray(){

        int[] mass = new int[10];//Создаем рандомный массив из 1 и 0;
        for(int i = 0; i < mass.length; i++){
            mass[i] = (int) (Math.random()*2);
        }

            System.out.println("Исходный массив: " + Arrays.toString(mass));

        for (int i = 0; i < mass.length; i++){

            if (mass[i] == 1){//Заменяем 1 на 0 и 0 на 1;
                mass[i] = 0;
            }else  if (mass[i] < 1){
                mass[i] = 1;
            }
        }

            System.out.println("Возвращаем измененный массив: " + Arrays.toString(mass));
    }

    public static  int[] array100(){

        int[] mass = new int[100];
        for(int i = 0; i < mass.length; i++){
            mass[i] = i;
        }
        return mass;
    }

    public static  int[] array3(){

        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < mass.length; i++){
            if (mass[i] < 6){
                mass[i] = mass[i]*2;
            }
        }
        return mass;
    }
    public static void deepArray(int x){
       int[][] twoArray = new int[x][x];
       for (int i = 0; i < twoArray.length; i++) {
           for (int j = 0; j < twoArray.length; j++) {
               if (i == j || i + j == twoArray.length - 1) {
                   twoArray[i][j] = 1;
               } else {
                   twoArray[i][j] = 0;
               }
           }
       }
            for (int[] string: twoArray){
                for (int columb:string){
                    System.out.print("\t" + columb);
                }
            System.out.println();
            }

       }
       public static int[] array111(int len, int initialValue){
            int[] arr = new int[len];
            for (int i = 0; i < arr.length; i++){
                arr[i] = initialValue;
            }
            return arr;
       }

       public static void maxAndMinArray(int size){
        int [] mass1 = new int[size];
            for (int i = 0; i < mass1.length; i++){
                mass1[i] = (int) (Math.random()*10);
            }
           System.out.println(Arrays.toString(mass1));
            int minN = mass1[0];
            int maxN = mass1[0];
            for(int i = 0; i <mass1.length; i++){
                if(mass1[i] > maxN){
                    maxN = mass1[i];
                } else if (mass1[i] < minN){
                    minN = mass1[i];
                }
            }
           System.out.println("Максимальный элемент: " + maxN);
           System.out.println("Минимальный элемент: " + minN);
       }
    public static boolean sumArray(int[] a, int[] b){
        int sum1 = 0;
        int sum2 = 0;
        boolean out = false;
        for (int i = 0; i < a.length; i++){

            sum1 += a[i];
        }
        for (int i = 0; i < b.length; i++){
            sum2 += b[i];
        }
        if (sum1 == sum2){
            out = true;
        }else {out = false;}
        return out;
    }

    public static void changArray(int[] a, int n){
        int[] arr = a;
        if (n > 0) {
            for(int i = 0; i < n; i++){
                int buff = arr[0];
                arr[0] = arr[arr.length-1];
                for(int j = 1; j < arr.length-1; j++){
                    arr[arr.length-j] = arr[arr.length - j - 1];
                }
                a[1] = buff;
            }
        }else {}
        System.out.println(Arrays.toString(arr));//не могу понять логику, как действовать в обратном направлении;
    }

}

