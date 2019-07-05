package com.mobileapps.week03test;

public class Exercise01
{
    // 1. Create a program which checks if the string has the correct order of parenthesis/brackets. ({})[] = true, []{]}[ = false


    public static void main(String[] args)
    {

        String stringTOInspect = "[]{]}[ ";

        System.out.println(inspect(stringTOInspect));
    }

    private static boolean inspect(String stringTOInspect)
    {
        char[] flags = {'(','{','}',')','[',']'};
        int flagIndex =0;


        for (int i = 0; i<stringTOInspect.length() ; i++)
        {
            if (stringTOInspect.charAt(i) == flags[flagIndex])
            {
                if(flagIndex == flags.length-1)
                {
                    return true;
                }
                flagIndex++;
            }
        }

        return false;
    }

}
