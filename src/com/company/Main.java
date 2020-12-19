package com.company;

import org.apache.commons.math3.distribution.NormalDistribution;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SlideWindow slideWindow = new SlideWindow(10);
//        for(int i=0; i<200;i+=10){
//            System.out.println(slideWindow.phi(i));
//            slideWindow.addTime(i);
//        }
        NormalDistribution normalDistribution = new NormalDistribution(1545849.75 , 22387.405794050814);

    }
}
