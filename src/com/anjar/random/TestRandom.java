/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.anjar.random;

import java.util.ArrayList;

/**
 *
 * @author Anjar_Ibnu
 */
public class TestRandom {
    public static void main(String args[])
    {
        Data data1 = new Data(15, 3, 5, (int)Math.pow(2, 4));
        int [] hasil = getRandomSequence(data1);
        for(int ii=0; ii<hasil.length; ii++)
        {
            System.out.println(hasil[ii]);
        }
    }
    
    public static void cekCounterData(int [] countData)
    {
        for(int ii=0; ii<countData.length; ii++)
        {
            System.out.print(countData[ii] + ", ");
        }
    }
    
    public static void cekRandomOnCounter(Data data, int[] counter)
    {
        Random random = new Random(data);
        System.out.println("====HASIL_RANDOM====");
        for(int ii=0; ii<counter.length; ii++)
        {
            counter[data.getSeed()]++;
            System.out.print(random.getRandom() + ", ");
        }
        System.out.println("==========");
    }
    
    public static int [] getRandomSequence(Data data)
    {
        int [] result = new int[data.getBatas()];
        Random rand = new Random(data);
        for(int ii=0; ii<result.length ; ii++)
        {
            result[ii] = rand.getRandom();
        }
        return result;
    }
}