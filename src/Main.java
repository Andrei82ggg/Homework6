public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 6");
        System.out.println(" ");{

        }

        for(int i = 0; i <= 10; i = i + 1){
            System.out.println("Итерация цикла " + i);
        }
        for (int i = 10; i>=1; i = i - 1){
            System.out.println("Интерация цикла"+i);
            System.out.println("  ");
        }
        for (int i = 0; i < 17; i = i + 2){
            System.out.println("Все четные числа"+i);
        }

        for (int i = -10; i <= 10; i = i + 1){
            System.out.println(i);
        }
        for (int i = 1904; i < 2096; i = i + 4){
            System.out.println("Високосный год " + i);
        }
        for (int i = 7; i < 98; i = i + 7){
            System.out.println("Число " + i);
        }
        int salary = 29_000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total/100*12;
            total = total + salary;
            System.out.println("Месяц "+i+" сумма накоплений равна"+total+"рублей");
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println("2* "+i+" ="+(2*i));
        }


    }
}