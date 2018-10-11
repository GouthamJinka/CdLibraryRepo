package com.simplelearn.datamanager;

public class Tracks {
	private String title;
	private String author;
	private int playingtime;
	public Tracks(String title, String author, int playingtime) {
		super();
		this.title = title;
		this.author = author;
		this.playingtime = playingtime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPlayingtime() {
		return playingtime;
	}
	public void setPlayingtime(int playingtime) {
		this.playingtime = playingtime;
	}
	
	
}
