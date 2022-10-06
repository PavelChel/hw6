public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1");

        for ( int i = 0; i < 10; i ++){
            System.out.println("Число " + i);
        }
    System.out.println(" Задание 2");

        for ( int i1 = 10; i1 > 1; i1 = i1 - 1){
            System.out.printf(" Число " + i1);
        }

    System.out.println(" Задание 3");

        for ( int i2 = 0; i2 <=17; i2++) {
            if (i2 % 2 == 0) {
                System.out.printf(" Число " + i2);
            }
        }

    System.out.println(" Задание 4");

        for ( int i3 =10;i3 >-10;i3--) {
            System.out.printf(" Число " + i3);}

    System.out.println(" Задание 5");

        for ( int i4 = 1904;i4 <=2096; i4 = i4+4){
            System.out.printf(" Высокосный год " + i4);
        }

    System.out.println(" Задание 6");

        for ( int i5 = 7; i5 <= 98; i5 = i5 +7) {
            System.out.printf(" Число " +i5 );
        }

    System.out.println(" Задание 7");

        for ( int i6=1,i7=2;i7<=512;i6++,i7*=2) {
            System.out.printf(" Число " + i7 );
            }

    System.out.println(" Задание 8");

        int i7=29000;
        int i8=0;
        for (int i9 = 1; i9 <13; i9++) {
            i8 = i8 + i7;
            System.out.printf(" Месяц " + i9 + ", сумма накоплений равна " + (i8+(i8/100)) + " рублей ");
        }




    }
}