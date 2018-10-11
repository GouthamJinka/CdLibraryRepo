package com.simplelearn.datamanager;

import java.util.ArrayList;
import java.util.List;

public class DataManager {

	public List<Cd> fetchCdList() {
		
		List<Cd> cdList =new ArrayList<Cd>();
		List<Tracks> trackList1=new ArrayList<Tracks>();
		
		Tracks track1=new Tracks("title1", "author1", 17);
		Tracks track2=new Tracks("title2", "author2", 18);
		trackList1.add(track1);
		trackList1.add(track2);
		List<Tracks> trackList2=new ArrayList<Tracks>();
		
		Tracks track3=new Tracks("title3", "author3", 17);
		Tracks track4=new Tracks("title4", "author4", 18);
		trackList2.add(track3);
		trackList2.add(track4);
		
		List<Tracks> trackList3=new ArrayList<Tracks>();
		
		Tracks track5=new Tracks("title5", "author5", 17);
		Tracks track6=new Tracks("title6", "author6", 18);
		trackList3.add(track5);
		trackList3.add(track6);
		
		List<Tracks> trackList4=new ArrayList<Tracks>();
		
		Tracks track7=new Tracks("title7", "author7", 17);
		Tracks track8=new Tracks("title8", "author8", 18);
		trackList4.add(track7);
		trackList4.add(track8);
		
		Cd cd=new Cd(1,"title1","artist1",2017,5,35,trackList1);
		Cd cd1=new Cd(1,"title2","artist2",2017,5,35,trackList2);
		Cd cd2=new Cd(1,"title3","artist3",2017,5,35,trackList3);
		Cd cd3=new Cd(1,"title4","artist4",2017,5,35,trackList4);
		cdList.add(cd);
		cdList.add(cd1);
		cdList.add(cd2);
		cdList.add(cd3);
		return cdList;
	}
	
	

}
