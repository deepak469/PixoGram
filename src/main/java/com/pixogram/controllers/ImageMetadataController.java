package com.pixogram.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pixogram.exceptions.ResourceNotFoundException;
import com.pixogram.models.ImageMetadata;
import com.pixogram.repositories.ImageMetadataRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class ImageMetadataController
{
	@Autowired
    ImageMetadataRepository imageMetadataRepository;
	
	/**
	 * Returns all users
	 * @return
	 */
	@GetMapping("/imagemetadata/getAll")
    public List<ImageMetadata> getAllUsers() 
	{
        return imageMetadataRepository.findAll();
    }
	
	/**
	 * Returns a specific user by searching for their Id
	 * @param userId
	 * @return
	 */
    @GetMapping("/imagemetadata/")
    public ImageMetadata getUserById(@RequestParam(value = "id") Integer userId) 
    {
        return imageMetadataRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("ImageMetadata", "id", userId));
    }
    
	@PostMapping("/imagemetadata")
    public ImageMetadata createMentor(@Valid @RequestBody ImageMetadata imageMetadata) 
	{	
        return imageMetadataRepository.save(imageMetadata);
    }
}