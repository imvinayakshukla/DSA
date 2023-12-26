import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        int a[] = { 9, 1, 5, 4, 7, 6, 2, 65, 15, 48 };

        BubbleSort obj = new BubbleSort();
        obj.sort(a);
        obj.print(a);

    }

    public void print(int a[]) {
       for (int i = 0; i < a.length; i++) {
        System.out.print(a[i]+" ");
       
    }

    }

    public void sort(int a[]) {
        int n = a.length;
        boolean swap = false;

        for (int i = 0; i < (n - 1); i++) {
            swap = true;
            for (int j = 0; j < (n - i - 1); j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap = true;

                }

            }
            if (swap == false)
                break;
        }

    }
}