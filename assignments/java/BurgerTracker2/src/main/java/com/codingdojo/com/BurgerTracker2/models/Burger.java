package com.codingdojo.com.BurgerTracker2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
	
	@Entity
	@Table(name="burgers")
	public class Burger {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		
		@NotNull
		@Size(min=1, max=255, message="Burger name must not be null")
		private String name;
		
		@NotNull
		@Size(min=1, max=255, message="Restaurant name must not be null")
		private String restaurant;
		
		@NotNull
		@Min(1)
		@Max(5)
		private int rating;
		
		@NotNull
		@Size(min=1, max=255, message="Notes must not be empty")
		private String notes;
		
		public Burger() {}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRestaurant() {
			return restaurant;
		}

		public void setRestaurant(String restaurant) {
			this.restaurant = restaurant;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		public String getNotes() {
			return notes;
		}

		public void setNotes(String notes) {
			this.notes = notes;
		}
	}
