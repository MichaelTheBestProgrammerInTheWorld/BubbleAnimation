package com.example.maichel.bubbleanimation;

import android.view.animation.Interpolator;

/**
 * Created by MAICHEL on 14/12/2017.
 */

public class MyBounceInterpolator implements Interpolator {

    private double mAmplitude = 1;
    private double mFrequency = 10;

    public MyBounceInterpolator(double amplitude, double frequency) {
        mAmplitude = amplitude;
        mFrequency = frequency;
    }

    public float getInterpolation(float time) {
        return (float) (-1 * Math.pow(Math.E, -time/ mAmplitude) *
                Math.cos(mFrequency * time) + 1);
    }
}
