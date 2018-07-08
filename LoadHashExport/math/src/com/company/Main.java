package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        mather();
        //BinaryTree test = new BinaryTree();
        //test.build123c();
       // test.printTree();

    }

    public static void mather()
    {
        ArrayList<String> al = new ArrayList<String>();
        for (int i = 0; i <= 200; i++)
        {
            al.add(String.valueOf(i));
            System.out.println(al.get(i));
        }
        Double log2 = LogOfBase(2, al.size());
        System.out.println(log2);
        System.out.println("ATA: " + AmountToAdd(log2, 2));
    }



    public static double LogOfBase(int base, int num)
    {
        return Math.log(num) / Math.log(base);
    }

    public static int AmountToAdd(double din, int base)
    {
        int inum = 0;
        int iadd;
        double ceiling = Math.ceil(din);
        if (ceiling == din) {
            return inum;
        }
        else
        {
            double dinPlay = Math.pow(base * 1.00, din);
            double difference = Math.pow(base * 1.00, ceiling) - dinPlay;
            return (int)difference;
        }
    }
}
