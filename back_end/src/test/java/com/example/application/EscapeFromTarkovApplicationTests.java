package com.example.application;

import com.example.application.models.AmmoType;
import com.example.application.models.Caliber;
import com.example.application.repositories.AmmoTypeRepository;
import com.example.application.repositories.CaliberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EscapeFromTarkovApplicationTests {

	@Autowired
	AmmoTypeRepository ammoTypeRepository;

	@Autowired
	CaliberRepository caliberRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createAmmoTypeAndCalibers() {
		Caliber caliber = new Caliber("12 gauge");
		caliberRepository.save(caliber);


		AmmoType buckshot = new AmmoType("buckshot", 37, 1, 15, 0, 3, 3, 3, 3, 3, 3, caliber );
		ammoTypeRepository.save(buckshot);
	}

}
