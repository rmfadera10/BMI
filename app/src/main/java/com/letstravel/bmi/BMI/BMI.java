package com.letstravel.bmi.BMI;

public class BMI {
    int weight;
    float height;

    public float BMI(){
        return weight/(height*height);
    }
    public BMI(int weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
