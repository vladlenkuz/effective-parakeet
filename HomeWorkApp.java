package TheTask1;

public class HomeWorkApp {
    public static void main(String[] args) {
        HomeWorkApp.printThreeWords();
        HomeWorkApp.chekSumSign(-10,5);
        HomeWorkApp.compareNumbers(5,10);
        HomeWorkApp.printColor(150);
    }
    public static void printThreeWords(){
      System.out.println("_Orange");
      System.out.println("_ Banana");
      System.out.println("_ Apple");
    }
    public static void chekSumSign(int a, int b) {
        //int a = 5;
        //int b = 8;
        int sum = a + b;
        if (sum <= 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }

    }
    public static void printColor(int value){
        //int value = 6;
        if (value<=0){
            System.out.println("Красный");
        }else if (value > 0 && value <=100){
            System.out.println("Желтый");
        }else if (value>100){
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(int a, int b){
       if (a>=b){
           System.out.println("a >= b");
       } else {
           System.out.println("a < b");
       }
    }
}
