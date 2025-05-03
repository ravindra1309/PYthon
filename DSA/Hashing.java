package DSA;

import java.util.HashMap;
import java.util.Scanner;

public class Hashing {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            int freq=0;
            if(mp.containsKey(key))
            {
                freq=mp.get(key);
            }
            freq++;
            mp.put(key,freq);
        }

        for(int key:mp.keySet())
        {
            System.out.println(key+" occurs "+mp.get(key)+" in the array");
        }
        sc.close();
    }
}
