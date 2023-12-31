package com.example.weatherapp.data.dto;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ForecastResponseDTO {
    @SerializedName("coord")
    public CoordinatesDTO point;
    public ArrayList<WeatherDTO> weather;
    public String base;
    @SerializedName("main")
    public TemperatureDTO temperature;
    public int visibility;
    public WindDto wind;
    public CloudDTO clouds;
    public int dt;
    public SysDTO sys;
    public int timezone;
    public int id;
    public String name;
    public int cod;

    public ForecastResponseDTO() {
    }

    public CoordinatesDTO getPoint() {
        return point;
    }

    public void setPoint(CoordinatesDTO point) {
        this.point = point;
    }

    public ArrayList<WeatherDTO> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<WeatherDTO> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public TemperatureDTO getTemperature() {
        return temperature;
    }

    public void setTemperature(TemperatureDTO temperature) {
        this.temperature = temperature;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public WindDto getWind() {
        return wind;
    }

    public void setWind(WindDto wind) {
        this.wind = wind;
    }

    public CloudDTO getClouds() {
        return clouds;
    }

    public void setClouds(CloudDTO clouds) {
        this.clouds = clouds;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public SysDTO getSys() {
        return sys;
    }

    public void setSys(SysDTO sys) {
        this.sys = sys;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
