package lec4;


/**
 * Використання імені типу var
 */
public class ex7_1 {
    public static void main(String[] args) {

        var i =1;
        var d = 1.1;

        if (Integer.valueOf(i) instanceof Integer) {
            System.out.println("type int: " + i);
        }
        if (Double.valueOf(d) instanceof Double) {
            System.out.println("type double: "+ d);
        }

    }
}
;