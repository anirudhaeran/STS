import java.util.Scanner;

public class chineese {

    public static void calculate(int num[],int rem[],int k)
    {
        int x=1;
        boolean b=true;
        while(b==true){
            int count=0;
            for(int i=0;i<k;i++){
                if(x%num[i]==rem[i])
                count++;
            }
            if(count==k)
            {
                b=false;
                System.out.println(x);
            }
            x++;
        }
    }
    public static void main(String[] args) {
        int k=3;
        int num[]={3,4,5};
        int rem[]={2,3,1};
        calculate(num, rem, k);
    }
}
