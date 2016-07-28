package com.spring;

import java.util.List;

public class LaptopService {
	
	private LaptopDAO laptopDAO;
	
	public LaptopDAO getLaptopDAO() {
		return laptopDAO;
	}

	public void setLaptopDAO(LaptopDAO laptopDAO) {
		this.laptopDAO = laptopDAO;
	}


	public void insertLaptopDetails(Laptop laptop) {
		laptopDAO.insertLaptopDetails(laptop);
	}

	public List<Laptop> getLaptopDetails(int modelNum) {
		return laptopDAO.getLaptopDetails(modelNum);
				
	}
}
