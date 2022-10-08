public class Main {

    public static void main(String[] args) {
        task1();
        task2();
      }

    private static void task1() {
        System.out.println("""
                Задание 1. Напишите программу, которая создает три объекта класса CreditCard
                           у которых заданы номер счета и начальная сумма.
                           Положите деньги на первые две карточки и снимите с третьей.
                           Выведите на экран текущее состояние всех трех карточек.
                           увеличить каждый элемент на заданное число.\n""");

        CreditCard creditCard1 = new CreditCard(123456789, 1772.19);
        CreditCard creditCard2 = new CreditCard(234567891, 1793.23);
        CreditCard creditCard3 = new CreditCard(345678912, 1795.24);

        creditCard1.outData();
        creditCard2.outData();
        creditCard3.outData();

        System.out.println("\nПосле:");

        creditCard1.calc(2500.90,1);
        creditCard2.calc(4000,1);
        creditCard3.calc(500.25,2);
    }

    private static void task2() {
        System.out.println("""
                \nЗадание 2. Создать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран;
                           Создать объект "компьютер 2" с помощью второго конструктора и вывести информацию на экран.\n""");

        HDD Hdd = new HDD("Seagate", 4,"External");
        RAM Ram = new RAM("DDR5",4096);

        Computer computer1 = new Computer(1500,"Acer");
        computer1.compinfo();

        Computer computer2 = new Computer(2800, "Dell",Hdd,Ram);
        computer2.compinfo();
    }
}