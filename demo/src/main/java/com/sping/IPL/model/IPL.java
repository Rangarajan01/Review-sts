package com.sping.IPL.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "IPL")

public class IPL {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int points;
	private int Winnings;
	private int Loses;
	private float strikerate;
	private float netrunrate;
	private int position;
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
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getWinnings() {
		return Winnings;
	}
	public void setWinnings(int winnings) {
		Winnings = winnings;
	}
	public int getLoses() {
		return Loses;
	}
	public void setLoses(int loses) {
		Loses = loses;
	}
	public float getStrikerate() {
		return strikerate;
	}
	public void setStrikerate(float strikerate) {
		this.strikerate = strikerate;
	}
	public float getNetrunrate() {
		return netrunrate;
	}
	public void setNetrunrate(float netrunrate) {
		this.netrunrate = netrunrate;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "IPL [id=" + id + ", name=" + name + ", points=" + points + ", Winnings=" + Winnings + ", Loses=" + Loses
				+ ", strikerate=" + strikerate + ", netrunrate=" + netrunrate + ", position=" + position + "]";
	}
	
	
}
