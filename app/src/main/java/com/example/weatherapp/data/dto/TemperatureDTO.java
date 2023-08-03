package com.example.weatherapp.data.dto;

import com.google.gson.annotations.SerializedName;

public class TemperatureDTO {
    public Float temp;
    @SerializedName("feels_like")
    public Float feelsLike;
    @SerializedName("temp_min")
    public Float tempMin;
    @SerializedName("temp_max")
    public Float tempMax;
    public Float pressure;
    public int humidity;
}
