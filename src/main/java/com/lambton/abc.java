package com.lambton;


import java.util.*;

public class abc
{
    private ArrayList<String> mStringArrayList;

    public static void main(String[] args)
    {
        HashMap<String, ArrayList>map=new HashMap<>();

        ArrayList<String> inputStrings= new ArrayList<>();
        inputStrings.add("ABC");
        inputStrings.add("CAB");
        inputStrings.add("CAD");
        inputStrings.add("MATE");
        inputStrings.add("ATEM");
        inputStrings.add("BAC");
        inputStrings.add("TAC");
        inputStrings.add("ATC");
        inputStrings.add("CAT");
        inputStrings.add("POP");
        inputStrings.add("PUT");
        inputStrings.add("123");
        inputStrings.add("231");
        inputStrings.add("431");


        for(String s: inputStrings)
        {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            ArrayList<String> arrayList = map.get(key);

            if(arrayList == null)
            {
               arrayList= new ArrayList<>();
            }
            arrayList.add(s);
            map.put(key,arrayList);
        }

        System.out.println(map);

    }
}