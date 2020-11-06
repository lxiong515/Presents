package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.HolidayParty;
import dmacc.beans.Presents;

@Configuration
public class BeanConfiguration {

	@Bean
	public Presents presents() {
		Presents bean = new Presents();
		//bean.setName("Dr. Seuss");
		//bean.setPresent("Pen");
		//bean.setRelationship("Associate");
		return bean;
	}
	@Bean
	public HolidayParty holidayParty() {
		//HolidayParty bean = new HolidayParty("Work Xmas", "123 Main St", "Ankeny", "IA");
		HolidayParty bean = new HolidayParty();
		return bean;
	}
}
