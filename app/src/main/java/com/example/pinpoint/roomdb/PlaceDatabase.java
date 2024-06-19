package com.example.pinpoint.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.pinpoint.model.Place;

@Database(entities = {Place.class},version = 1)
public abstract class PlaceDatabase extends RoomDatabase {
    public abstract PlaceDao placeDao();

}
