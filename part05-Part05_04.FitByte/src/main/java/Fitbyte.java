/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benri
 */
//instantiate data for object
public class Fitbyte {
    private int restingHeartRate;
    private int age;
    
    public Fitbyte(int restingHeartRate, int age){
        this.restingHeartRate = restingHeartRate;
        this.age = age;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        return (maximumHeartRate - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate;
    }
}
