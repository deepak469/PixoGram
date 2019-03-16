package com.pixogram.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pixogram.models.ImageMetadata;

/**
 * Persistence layer for User entity
 * Adds findByUsername method for use with authentication
 * @author Ed
 *
 */
@Repository
public interface ImageMetadataRepository extends JpaRepository<ImageMetadata, Integer>
{

}