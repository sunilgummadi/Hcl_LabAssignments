package com.pojo;

public class Room {
	private int roomNo;
	private String roomType;
	private float roomArea;
	private boolean acMachine;

	public Room(int roomNo, String roomType, float roomArea, boolean acMachine) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.acMachine = acMachine;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public float getRoomArea() {
		return roomArea;
	}

	public boolean isAcMachine() {
		return acMachine;
	}

	@Override
	public String toString() {
		return "Room [roomNo=" + roomNo + ", roomType=" + roomType + ", roomArea=" + roomArea + ", acMachine="
				+ acMachine + "]";
	}

}
