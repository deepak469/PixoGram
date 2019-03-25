package com.pixogram.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "imagecomments")
public class ImageComments
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column
	private String filename;
	
	@Column
	private String username;
	
	@Column
	private String comment;
	
	public void setFilename(String inputFilename)
	{
		this.filename = inputFilename;
	}
	
	public String getFilename()
	{
		return this.filename;
	}
	
	public void setUsername(String inputUsername)
	{
		this.username = inputUsername;
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public void setComment(String inputComment)
	{
		this.comment = inputComment;
	}
	
	public String getComment()
	{
		return this.comment;
	}
}