// +На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
// - команда 1 (к1): увеличить а в с раз, а умножается на c
// - команда 2 (к2): увеличить на d, к a прибавляется d
// написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к2, к2, к2, к2, к2, к2, k2 или к1, к1, к2, к2, к2 
// Можно начать с более простого – просто подсчёта общего количества вариантов 
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения.

public class Practical001 {

    public static void main(String[] args) {
        int a = 1;
        int b = 7;
        int c = 2;
        int d = 1;
        String k1 = "k1";
        String k2 = "k2";

        if (a > b){
            System.out.println("Нет решения");
        }

        // while (a != b){
        //     a = a + d;
        //     System.out.print(k2 + ", ");
        // }

        while (a != b && a < b){
            if (a < (b - a)){
            a = a * c;
            System.out.print(k1 + ", ");
            } else{
            a = a + d;
            System.out.print(k2 + ", ");
            }
        }
    }
}
