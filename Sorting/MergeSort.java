import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        int a[] = { 9, 1, 5, 4, 7, 6, 2, 65, 15, 48 };

        MergeSort obj = new MergeSort();
        obj.sort(a, 0, a.length - 1);
        obj.print(a);

    }

    public void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }

    }

    public void sort(int a[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(a, l, m);
            sort(a, m + 1, r);
            merge(a, l, m, r);
        }

    }

    public void merge(int[] a, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int a1[] = new int[n1];
        int a2[] = new int[n2];

        for (int i = 0; i < n1; i++)
            a1[i] = a[l + i];
        for (int j = 0; j < n2; j++)
            a2[j] = a[m+1+j];

            int i=0,j=0,k=l;

            while(i<n1 && j<n2)
            {
                if(a1[i]<=a2[j])
                {
                    a[k]=a1[i];
                    i++;
                }
                else{
                    a[k]=a2[j];
                    j++;
                }
                k++;
            }
            while(i<n1)
            {
                a[k]=a1[i];
                i++;
                k++;
            }
            while(j<n2)
            {
                a[k]=a2[j];
                j++;
                k++;
            }



    }
}