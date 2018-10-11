package example;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.simplelearn.datamanager.Cd;
import com.simplelearn.datamanager.DataManager;

public class NewTest {

	@Test
	public void verifyCdListSize() {
		DataManager  dataManager =new DataManager();
		List<Cd> cdList=new ArrayList<Cd>();
		cdList= dataManager.fetchCdList();
		int expected=cdList.size();
		assertEquals(expected, 4);
	}
	
	
	@Test
	public void verifyTracksListSize() {
		DataManager  dataManager =new DataManager();
		List<Cd> cdList=new ArrayList<Cd>();
		cdList= dataManager.fetchCdList();
		boolean expected=false;
		for (Cd cd : cdList) {
			if(cd.getTracks().size()>0){
				expected=true;
			}
		}
		assertEquals(expected, true);
	}

}

