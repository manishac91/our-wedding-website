package com.wedding.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedding.app.entity.AboutUsEntity;
import com.wedding.app.repository.WeddingRepository;

@RestController
public class MasterDataController {
	
	@Autowired
	WeddingRepository weddingRepository;
	
	@GetMapping("/masterData")
	public List<AboutUsEntity> getAllData() {
		return weddingRepository.findAll();
	}

}
