package com.cg.casestudy.carwash.service;

import java.util.List;
import java.util.Map;

import com.cg.casestudy.carwash.document.Addons;

public interface AddOnService {
	public Addons addAddons(Map<String, String> object);
	public Addons editAddons(Addons updatedAddon);
	public List<Addons> getAllAddons();
}
