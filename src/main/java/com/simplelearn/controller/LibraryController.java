package com.simplelearn.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.simplelearn.datamanager.Cd;
import com.simplelearn.datamanager.DataManager;
@Controller
public class LibraryController {
	
	private static final String VIEW_INDEX = "index";

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String cdList(ModelMap model) {
		DataManager  dataManager =new DataManager();
		List<Cd> cdList=new ArrayList<Cd>();
		cdList= dataManager.fetchCdList();
		model.addAttribute("cd", cdList);
		return VIEW_INDEX;

	}


}
