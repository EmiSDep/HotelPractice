package com.emisdep;

public class Guest {
    private String name;
    private String phoneNumber;
    private String roomType;
    private int partySize;
    private int roomNumber;

    public Guest(String name, String phoneNumber, String roomType, int partySize, int roomNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.roomType = roomType;
        this.partySize = partySize;
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return name;
    }

    public String getRoomType() {
        return roomType;
    }

}
