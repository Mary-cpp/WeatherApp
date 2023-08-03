package com.example.weatherapp.data.dto;

public class WindDto {
    public int speed;
    public int deg;

    public WindDto(int speed, int deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }
}
