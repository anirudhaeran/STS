import java.util.Scanner;

public class max_pro_sub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int max=Integer.MIN_VALUE;
        int pref=1;int suff=1;

        for(int i=0;i<n;i++)
        {
            if(pref==0) pref=1;
            if(suff==0) suff=1;

            pref*=arr[i];
            suff*=arr[n-1-i];
            max=Math.max(max,Math.max(suff, pref));
        }
        System.out.println(max);
    }
}
