package arrays;

public class Array {
    private int[] mas;

    public Array(int[] mas) {
        this.mas = mas;
    }

    public int[] getMas() {
        return mas;
    }

    public void setMas(int[] mas) {
        this.mas = mas;
    }

    public int findMax() {
        int max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        return max;
    }

    public void sort() {
        int k;
        int element;
        for (int i = 1; i < mas.length; i++) {
            k = 1;
            element = mas[i];
            while (k <= i && mas[i - k] > element) {
                mas[i - k + 1] = mas[i - k];
                mas[i - k] = element;
                k++;
            }
        }
    }
}
