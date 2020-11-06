package dmacc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.HolidayParty;
import dmacc.beans.Presents;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PresentsRepository;

@SpringBootApplication
public class PresentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PresentsApplication.class, args);
	}
	/*
	@Autowired
	PresentsRepository repo;


	@Override
	public void run(String... args) throws Exception{
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//using an exisitng bean
		Presents p = appContext.getBean("presents", Presents.class);
		p.setRelationship("co-worker");
		repo.save(p);
		
		//creating a bean to use - not managed by Spring
		Presents d = new Presents("Mr. Smith", "Coffee Mug", "Co-Worker");
		HolidayParty h = new HolidayParty("Work Xmas Party", "100 Locust St", "Des Moines", "IA");
		d.setHolidayParty(h);
		repo.save(d);
	}
	//((AbstractApplicationContext)appContext).close();

	*/
}
