package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] array = {2, 5, -3, 11, 193, -2};
        int sum = 0;

        for (int a : array)
        {
            System.out.print(a + "  ");
            sum = sum + a;
        }
        System.out.println("Sum = " + sum);
    }
}
