/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eci.arsw.math;

/**
 *
 * @author juan.mmendez
 */
public class ThreadPI extends Thread{

    private int start;
    private int count;
    private byte[] digits;
    
    public void setParams(int start, int count){
        this.start=start;
        this.count=count;
    }
    @Override
    public void run(){
        digits = PiDigits.getDigits(start,count);
    }
    
    public byte[] getDigits(){
        return digits;
    }
}
