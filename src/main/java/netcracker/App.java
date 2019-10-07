package netcracker;

import arrays.Array;

public class App {
    public static void main(String[] args) {
        int[] mas = {3, 10, 11, 0, 40, -9, -4};
        Array object = new Array(mas);
        System.out.println("Максимальный элемент массива: " + object.findMax());
    }
}
