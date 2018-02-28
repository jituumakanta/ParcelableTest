package com.example.lenovo.parcelabletest;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lenovo on 28-02-2018.
 */

public class RegistrationPogo implements Parcelable {
    String firstName = "", lastName = "", emailAddress = "", phoneNumber = "", city = "", state = "";
    int zipCode;
    HashMap<String, String> mapRegData = new HashMap<String, String>();

    public HashMap<String, String> getMapRegData() {
        return mapRegData;
    }
    public void setMapRegData(HashMap<String, String> mapRegData) {
        this.mapRegData = mapRegData;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    @Override
    public int describeContents() {
        // TODO Auto-generated method stub
        return 0;
    }
    public RegistrationPogo() {
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // TODO Auto-generated method stub
        dest.writeString(firstName);
        dest.writeString(lastName);
        dest.writeString(emailAddress);
        dest.writeString(phoneNumber);
        dest.writeString(state);
        dest.writeString(city);
        dest.writeInt(zipCode);
        final int N = mapRegData.size();
        // dest.writeInt(N);
        if (N > 0) {
            for (Map.Entry<String, String> entry : mapRegData.entrySet()) {
                dest.writeString(entry.getKey());
                String dat = entry.getValue();
                dest.writeString(dat);
            }
        }
    }
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public RegistrationPogo createFromParcel(Parcel in) {
            return new RegistrationPogo(in);
        }
        public RegistrationPogo[] newArray(int size) {
            return new RegistrationPogo[size];
        }
    };
    private RegistrationPogo(Parcel in) {
        firstName = in.readString();
        lastName = in.readString();
        emailAddress = in.readString();
        phoneNumber = in.readString();
        city = in.readString();
        state = in.readString();
        zipCode = in.readInt();
        final int N = in.readInt();
        for (int i = 0; i < N; i++) {
            String key = in.readString();
            String value = in.readString();
            mapRegData.put(key, value);
        }
    }
}