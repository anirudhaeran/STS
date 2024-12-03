import java.util.ArrayList;
import java.util.Scanner;

public class leaders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        ArrayList<Integer> arr1= new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                arr1.add(arr[i]);
                max=arr[i];
            }
        }

        System.out.println(arr1);
    }
}
