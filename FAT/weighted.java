package FAT;

import java.util.ArrayList;
import java.util.*;

public class weighted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int arr[]={1,4,7,16,10,11};
        List<Integer> l=new ArrayList<>();

        l.add(s.charAt(0)-'a'+1);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            l.add(l.get(i-1)+s.charAt(i)-'a'+1);
            else
            l.add(s.charAt(i)-'a'+1);
        }
        List<String> m=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(l.contains(arr[i]))
            m.add("Yes");
            else
            m.add("No");
        }
        System.out.println(m);
    }

}
