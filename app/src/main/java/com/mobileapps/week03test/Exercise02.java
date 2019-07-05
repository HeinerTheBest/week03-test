package com.mobileapps.week03test;

public class Exercise02
{
    /*
        2. Given a string and a non-empty substring sub, compute recursively if at least n copies
        of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.

            strCopies("catcowcat", "cat", 2) → true
            strCopies("catcowcat", "cow", 2) → false
            strCopies("catcowcat", "cow", 1) → true
    */

    public static void main(String[] args)
    {
        String string   = "catcowcat";
        String subString = "cow";
        int    repeat   = 2;

        System.out.println(strCopies(string,subString,repeat));
    }

    private static boolean strCopies(String string, String subString, int repeat)
    {
        if (string.length()<subString.length())
            return false;
        if (repeat<0)
            return false;
        if(repeat == 0)
            return true;
        return moveInString(0,string,subString,repeat);
    }

    private static boolean moveInString(int stringIndex, String string, String subString,int repeat)
    {
        if(repeat == 0)
        {
            return true;
        }
        if (stringIndex >= string.length())
        {
            return false;
        }
        if(string.charAt(stringIndex) == subString.charAt(0))
        {
            if(moveInSubString(0,stringIndex,string,subString))
            {
                repeat = repeat-1;
                return moveInString(stringIndex+subString.length(),string,subString,repeat);
            }
            return moveInString(stringIndex+1,string,subString,repeat);
        }
        else
        {
            if(stringIndex+1 >= string.length())
                return false;
            return moveInString(stringIndex+1,string,subString,repeat);
        }
    }


    private static boolean moveInSubString(int subStrinIndex,int stringIndex, String string, String subString)
    {
        if(string.charAt(stringIndex) == subString.charAt(subStrinIndex))
        {
         if (subStrinIndex<subString.length()-1)
         {
             return moveInSubString(subStrinIndex+1,stringIndex+1,string,subString);
         }
         else
         {
             return true;
         }
        }
        return false;
    }

}
