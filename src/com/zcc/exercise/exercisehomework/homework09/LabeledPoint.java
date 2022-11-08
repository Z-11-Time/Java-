package com.zcc.exercise.exercisehomework.homework09;

public class LabeledPoint extends Point{
    private String date;

    public LabeledPoint(String date,double x, double y) {
        super(x, y);
        this.date = date;
    }
}
