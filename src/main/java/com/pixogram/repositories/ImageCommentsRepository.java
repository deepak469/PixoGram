package com.pixogram.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pixogram.models.ImageComments;

/**
 * Persistence layer for ImageComment entity
 * Adds findByUsername method for use with authentication
 * @author Ed
 *
 */
@Repository
public interface ImageCommentsRepository extends JpaRepository<ImageComments, Integer>
{
	public List<ImageComments> findByFilename(String filename);
}
