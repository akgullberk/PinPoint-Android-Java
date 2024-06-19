package com.example.pinpoint.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Place {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name="name")
    public String name;

    @ColumnInfo(name="latitude")
    public Double latitude;

    @ColumnInfo(name="longitude")
    public Double longitude;

    public Place(String name,Double latitude, Double longitude){
        this.name=name;
        this.latitude=latitude;
        this.longitude=longitude;
    }

}
