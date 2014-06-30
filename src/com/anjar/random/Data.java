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
public class Data {

    private int seed;
    private int constanta;
    private int multiplier;
    private int batas;

    public Data(int seed, int constanta, int multiplier, int batas) {
        if (seed >= batas) {
            System.err.println("seed harus lebih kecil dari batasnya (:");
            System.exit(-1);
        }
        this.seed = seed;
        this.constanta = constanta;
        this.multiplier = multiplier;
        this.batas = batas;
    }

    public int getConstanta() {
        return constanta;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public int getSeed() {
        return seed;
    }

    public int getBatas() {
        return batas;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    public void setConstanta(int constanta) {
        this.constanta = constanta;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public void setBatas(int batas) {
        this.batas = batas;
    }
}
