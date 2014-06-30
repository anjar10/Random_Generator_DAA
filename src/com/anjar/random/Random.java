/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.anjar.random;

/**
 *
 * @author Anjar_Ibnu
 */
public class Random {
    private Data data;

    public Random(Data data) {
        this.data = data;
    }
    
    public int getRandom()
    {
        // result = (multiplier * Xn-1 + constanta) % period
        int result = (data.getMultiplier()*data.getSeed()+data.getConstanta())%data.getBatas();
        data.setSeed(result);
        return result;
    }
}