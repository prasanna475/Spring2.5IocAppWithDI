package com.spring;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
	public static void main(String[] args) {
		/*
		 * ApplicationContext context=new
		 * ClassPathXmlApplicationContext("Spring-Module.xml"); Hello
		 * h=(Hello)context.getBean("hello"); h.printHello();
		 */
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("Spring-Module.xml"));
		LaptopService laptopService = (LaptopService) factory.getBean("laptopService");
		Laptop laptop = getLaptop();
		laptopService.insertLaptopDetails(laptop);
		List<Laptop> laptopDetails = laptopService.getLaptopDetails(4324);
		System.out.println(laptopDetails);
	}

	private static Laptop getLaptop() {
		Laptop laptop = new Laptop();
		laptop.setModelNum(4324);
		laptop.setName("lenovo4");
		laptop.setCost(543);
		return laptop;

	}
}