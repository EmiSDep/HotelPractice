package com.emisdep;


public class Room extends Guest{

    private boolean isOccupied;

    public Room(String name, String phoneNumber, String roomType, int partySize, int roomNumber, boolean isOccupied) {
        super(name, phoneNumber, roomType, partySize, roomNumber);
        this.isOccupied = isOccupied;


    }
}



