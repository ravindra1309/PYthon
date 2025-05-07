package Array;

import java.util.ArrayList;

public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        int arr2[]={2,3,4,4,5,11,12};

        union(arr1, arr2);
    }
    public static void union(int arr1[],int arr2[])
    {
        ArrayList<Integer> Union=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length &&j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                if(Union.size()==0||Union.get(Union.size()-1)!=arr1[i])
                {
                    Union.add(arr1[i]);
                }
                i++;
            }
            else
            {
                if(Union.size()==0 || Union.get(Union.size()-1)!=arr2[j])
                {
                    Union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<arr1.length)
        {
            if(Union.get(Union.get(Union.size()-1))!=arr1[i])
            {
                Union.add(arr1[i]);
            }
            i++;
        }
        while(j<arr2.length)
        {
            if(Union.get(Union.size()-1)!=arr2[j])
            {
                Union.add(arr2[j]);
            }
            j++;
        }

        for(int a:Union)
        {
            System.out.print(a+" ");
        }
    }
}
