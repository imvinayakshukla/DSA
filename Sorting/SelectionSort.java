import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        int a[] = { 9, 1, 5, 4, 7, 6, 2, 65, 15, 48 };

        SelectionSort obj = new SelectionSort();
        obj.sort(a);
        obj.print(a);

    }

    public void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }

    }

    public void sort(int a[]) {
        int n = a.length;

        for (int i = 0; i < (n - 1); i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min])
                {
                    min=j;
                }}
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            

        }

    }
}