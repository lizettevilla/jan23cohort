package com.codingdojo.com.BookClub.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Title must not be blank!")
    @Size(min=3, max=30, message="Title must be between 2 and 30 characters")
	private String title;
	
	@NotBlank(message="Author must not be blank!")
    @Size(min=3, max=30, message="Author must be between 3 and 30 characters")
	private String author;
	
	@NotBlank(message="Thoughts must not be blank!")
    @Size(min=3, max=500, message="Thoughts must be between 3 and 500 characters")
	private String thoughts;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern = "yyy-MM-DD HH:mm:ss")
	private Date createdAt;
	
	@DateTimeFormat(pattern = "yyy-MM-DD HH:mm:ss")
	private Date updatedAt;
	
	
	public Book() {
		
	}

    // ==========================
    //        RELATIONSHIPS
    // ==========================
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User poster;
	
    // ==========================
    //     GETTERS / SETTERS
    // ==========================
    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

	@PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getThoughts() {
		return thoughts;
	}

	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
    public User getPoster() {
		return poster;
	}
	public void setPoster(User poster) {
		this.poster = poster;
	}
}