public class Main {
    public static void main(String[] args) {

        System.out.println(" Задача № 1 ");
        System.out.println();

        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i++;
            total = total + salary;
            total = total + total / 100;
            System.out.println(" Месяц " + i + " , сумма накоплений равна " + total + " рублей ");
        }

        System.out.println();
        System.out.println(" Задача № 2 ");
        System.out.println();
        {
            int i1 = 0;
            while (i1 < 10) {
                i1++;
                System.out.print(i1 + " ");
            }
            System.out.println();
            for (i1 = 10; i1 > 0; i1--) {
                System.out.print(i1 + " ");
            }
        }

        System.out.println();
        System.out.println(" Задача № 3 ");
        System.out.println();
        int peple = 12_000_000;
        int up = peple * 17 / 1000;
        int back = peple * 8 / 1000;
        for (int year = 1; year <= 10; year++) {
            peple = peple + year + (up - back);
            System.out.println(" Год " + year + ", численность населения составляет " + peple);
            System.out.println(" Рождаемость " + up);
            System.out.println(" Смертность " + back);
        }
        {
            System.out.println();
            System.out.println(" Задача № 4 ");
            System.out.println();
            int contribution = 15_000;
            int month = 1;
            while (contribution <= 12_000_000) {
                contribution = contribution + contribution * 7 / 100;
                month++;
                System.out.println(" Месяц " + month + " , сумма накоплений равна " + contribution + " рублей ");
            }
        }
        {
            System.out.println();
            System.out.println(" Задача № 5 ");
            System.out.println();
            int contribution = 15_000;
            int month = 1;
            while (contribution <= 12_000_000) {
                contribution = contribution + contribution * 7 / 100;
                if (month % 6 == 0) {
                    System.out.println(" Месяц " + month + " , сумма накоплений равна " + contribution + " рублей ");
                }
                month++;
            }
        }


        System.out.println();
        System.out.println(" Задача № 6 ");
        System.out.println();
        int contribution = 15_000;
        int year = 9 * 12;
        for (int month = 1; month <= year; month++) {
            contribution = contribution + contribution * 7 / 100;
            if (month % 6 == 0) {
                System.out.println(" Месяц " + month + " , сумма накоплений равна " + contribution + " рублей ");
            }
        }
        System.out.println();
        System.out.println(" Задача № 7 ");
        System.out.println();
        for (int friday = 2; friday <= 31; friday++) {
            if (friday % 7 == 0) {
                System.out.println(" Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет ");
            }
        }
        System.out.println();
        System.out.println(" Задача № 8 ");
        System.out.println();
        for (int z = 0; z < 2024 + 100; z += 79) {
            if (z >= 2024 - 200) {
                System.out.println(z);

            }

        }
    }
}





