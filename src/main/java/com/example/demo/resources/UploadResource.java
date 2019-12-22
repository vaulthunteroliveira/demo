package com.example.demo.resources;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins = "http://localhost:4200")
@RestController 
public class UploadResource {
	
	
	@PostMapping("/upload")
	public void uploadFile(@RequestParam("file") MultipartFile file){
	      String keyName = file.getOriginalFilename();
	      System.out.println(keyName);
	}

}
