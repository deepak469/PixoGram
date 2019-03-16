package com.pixogram.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Table used to store the Users details once signup has been completed
 * @author Ed
 *
 */
@Entity
@Table(name = "imagemetadata")
public class ImageMetadata
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
 
    @Column(name = "userId")
    private Integer userId;
 
    @Column(name = "filename")
    private String filename;
    
    @Column(name = "filetype")
    private String filetype;
 
    @Column(name = "size")
    private String size;
    
    public ImageMetadata() {}
 
    public ImageMetadata(Integer userId, String filename, String filetype, String size) 
    {
        this.userId = userId;
        this.filename = filename;
        this.filetype = filetype;
        this.size = size;
    }
    
    public void setUserId(Integer inputUserId)
    {
    	this.userId = inputUserId;
    }
    
    public Integer getUserId()
    {
    	return this.userId;
    }
    
    public void setFilename(String inputFilename)
    {
    	this.filename = inputFilename;
    }
    
    public String getFilename()
    {
    	return this.filename;
    }
    
    public void setFiletype(String inputFiletype)
    {
    	this.filetype = inputFiletype;
    }
    
    public String getFiletype()
    {
    	return this.filetype;
    }
    
    public void setSize(String inputSize)
    {
    	this.size = inputSize;
    }
    
    public String getSize()
    {
    	return this.size;
    }
}