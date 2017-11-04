package com.example.briannak.campuseventproject.Objects;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Defines and Event object.
 * Go Back and add in a Picture
 */

public class Event implements Serializable, Parcelable {
    private String name, university, category, date, details;


    public Event(String name, String university, String category, String date, String details) {
        this.name = name;
        this.university = university;
        this.category = category;
        this.date = date;
        this.details = details;
    }

    protected Event(Parcel in) {
        name = in.readString();
        university = in.readString();
        category = in.readString();
        date = in.readString();
        details = in.readString();
    }

    public static final Creator<Event> CREATOR = new Creator<Event>() {
        @Override
        public Event createFromParcel(Parcel in) {
            return new Event(in);
        }

        @Override
        public Event[] newArray(int size) {
            return new Event[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int i) {
        dest.writeString(name);
        dest.writeString(university);
        dest.writeString(category);
        dest.writeString(date);
        dest.writeString(details);
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", category='" + category + '\'' +
                ", date='" + date + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
