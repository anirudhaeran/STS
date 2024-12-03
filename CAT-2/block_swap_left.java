import java.util.Scanner;

public class block_swap_left {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int arr1[]=new int[d];
        int arr2[]=new int[n-d];
        
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(i<d)
            arr1[i]=arr[i];
            else
            {
                arr2[k]=arr[i];
                k++;
            }
        }
        int swapped[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(i<n-d)
            swapped[i]=arr2[i];
            else
            {swapped[i]=arr1[c];
            c++;}
        }
        for(int i=0;i<n;i++) System.out.print(swapped[i]+" ");
    }
}
