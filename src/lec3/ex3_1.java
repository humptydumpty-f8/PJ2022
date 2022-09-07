package lec3;

import java.io.IOException;

/**
 * Метод System.in.read() здійснює зчитування 8 біт символа
 * Коректно обробляється тільки латиниця!
 */
public class ex3_1 {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter a symbol:");
        int x = System.in.read();
        char c = (char) x;
        System.out.println("Код символа: " + c + " = " + x);

        /*Enter a symbol:
        ф
        Код символа: Ñ = 209*/
    }
}
