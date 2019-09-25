package com.lambton;

import java.util.*;

public class CollectionFrameworkExample
{
    public static void main(String[] args)
    {
        ArrayList<String> mStringArrayList = new ArrayList<>();
        mStringArrayList.add("A");
        mStringArrayList.add("B");
        mStringArrayList.add("C");
        mStringArrayList.add("C");

        mStringArrayList.add("A");
        mStringArrayList.add("A");

       // System.out.println(mStringArrayList);

       /* int i;
        for(i=0;i<=mStringArrayList.size()-1;i++)
        {
            System.out.println(mStringArrayList.get(i));
        }*/


        for(String s: mStringArrayList)
        {
            System.out.println(s);

        }
        Iterator<String>Iterator =mStringArrayList.iterator();
        while (Iterator.hasNext())
        {
            String s= Iterator.next();
            System.out.println(s);
        }
        Set<String>mySet = new HashSet<>();

        /*mySet.add("India");
        mySet.add("Canada");
        mySet.add("USA");
        mySet.add("China");

        System.out.println(mySet);

        mySet.add("India");
        System.out.println(mySet);*/

       Map<String, String>stringMap = new HashMap<>();
       /* stringMap.put("IND", "India");
        stringMap.put("CAN", "Canada");
        stringMap.put("USA", "United State");
        stringMap.put("PAK", "Pakistan");
        System.out.println(stringMap);
        stringMap.put("CAD", "New Canada");
        System.out.println(stringMap);*/

        Map<String, ArrayList<String>>stringArrayListMap = new HashMap<>();
        stringMap.put("India", "Punjab,Amritsar,Jalandhar");


        stringMap.put("Canada", "Ontario,Surry,Toronto");

        System.out.println(stringMap);




    }
}
