public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 6");
        System.out.println(" ");
        {

        }

        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println("Интерация цикла" + i);
            System.out.println("  ");
        }
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Все четные числа" + i);
        }

        for (int i = -10; i <= 10; i = i + 1) {
            System.out.println(i);
        }
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
        for (int i = 7; i < 98; i = i + 7) {
            System.out.println("Число " + i);
        }
        int salary = 29_000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total / 100 * 12;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна" + total + "рублей");
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println("2* " + i + " =" + (2 * i));
        }
        int sum = 0;
        int month = 1;
        while (sum <= 2_459_000) {
            sum = sum + 15_000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            month++;
        }
        {
            int i = 1;
            while (i <= 10) {
                System.out.println(i + " ");
                i++;
            }
            System.out.println();

            for (; i > 0; i--) {
                System.out.println(i + " ");
            }
            System.out.println();
        }
        {
            int populstion = 12_000_000;
            int birthRate = 17;
            int dethRate = 8;
            int plusRate = birthRate - dethRate;
            for (int i = 1; i <= 10; i++) {
                populstion = populstion + populstion / 1000 * plusRate;
                System.out.println("Год " + i + "численность населения составляет " + populstion);
            }
        }
        {
            double deposit = 15_000;
            var procent = 0.07;
            int monts = 1;
            while (deposit < 12_000_000) {
                deposit += deposit * procent;
                System.out.println("Месяц " + monts + ", сумма накоплений равна " + deposit + " рублей");
                monts++;
            }
        }
        {
            double deposit = 15_000;
            var procent = 0.07;
            int monts = 1;
            while (deposit < 12_000_000) {
                deposit += deposit * procent;
                if (monts % 6 == 0) {
                    System.out.println("Месяц " + monts + ", сумма накоплений равна " + deposit + " рублей");
                }
                monts++;
            }
        }
        {
            double deposit = 15_000;
            var procent = 0.07;
            int monts = 1;
            while (deposit <= 9*12) {
                deposit += deposit * procent;
                if (monts % 6 == 0) {
                    System.out.println("Месяц " + monts + ", сумма накоплений равна " + deposit + " рублей");
                }
                monts++;
            }
        }
        {
            for (int friday = 5; friday <=31; friday+= 7){
                System.out.println("Сегодня пятница "+friday+"-е число не забудьте подготовить отчет");
            }
        }
        {
            int starYear = 2023 - 200;
            int endYear = 2023 + 100;
            for (int i=0; i<= endYear; i+= 79){
                if (i > starYear){
                    System.out.println(i);
                }
            }
        }
    }
}
