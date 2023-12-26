import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {
        int a[] = { 9, 1, 5, 4, 7, 6, 2, 65, 15, 48 };

        InsertionSort obj = new InsertionSort();
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

       for(int i=1;i<n;i++)
       {
        int key=a[i];
        int j=i-1;

        while(j>=0 && a[j]>key)
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=key;
       }

    }
}