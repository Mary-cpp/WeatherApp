package com.example.weatherapp.data.dto;

import com.google.gson.annotations.SerializedName;

public class WeatherDTO {
    public int id;
    @SerializedName("main")
    public String mainDescription;
    public String description;
    public String icon;

    public WeatherDTO(int id, String mainDescription, String description, String icon) {
        this.id = id;
        this.mainDescription = mainDescription;
        this.description = description;
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMainDescription() {
        return mainDescription;
    }

    public void setMainDescription(String mainDescription) {
        this.mainDescription = mainDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
