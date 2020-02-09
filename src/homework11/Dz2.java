package homework11;

import java.util.Random;
/*
2*) Дан кирпич со сторонами a,b,c и отверстие со сторонами x,y. Определить пройдет ли кирпич в отверстие.
Например кирпич со сторонами 2,3,2 не пройдет в отверстие 1x50.*/

public class Dz2 {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(50) + 1;
        int b = random.nextInt(50) + 1;
        int c = random.nextInt(50) + 1;
        System.out.printf("Стороны кирпича: %s, %s, %s,", a, b, c);

        int x = random.nextInt(50) + 1;
        int y = random.nextInt(50) + 1;
        System.out.printf("\nОтверстие размером: %s x %s", x, y);
        System.out.println();

        if ((a <= x && b <= y) || (b <= x && a <= y) ||
            (a <= x && c <= y) || (c <= x && a <= y) ||
            (b <= x && c <= y) || (c <= x && b <= y)) {
            System.out.println("Кирпич проходит");
        } else {
            System.out.println("Кирпич не проходит");
        }
    }
}

