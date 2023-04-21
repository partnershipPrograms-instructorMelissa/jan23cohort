package com.example.wosmartprojc.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Name is required!")
    @Size(min=3, max=30, message="First Name must be between 2 and 30 characters")
	private String firstName;
	
	@NotBlank(message="Name is required!")
    @Size(min=3, max=30, message="First Name must be between 2 and 30 characters")
	private String lastName;
	
	
	@NotBlank(message="Email is required!")
    @Email(message="Please enter a valid email!")
	private String email;

    @NotBlank(message="Username is required!")
	private String username;
	
	@NotBlank(message="Password is required!")
    @Size(min=8, max=128, message="Password must be between 8 and 128 characters")
	private String password;
	
	@Transient
	@NotEmpty(message="Confirm Password is required!")
    @Size(min=8, max=128, message="Confirm Password must be between 8 and 128 characters")
	private String confirmPassword;

	@Column(updatable=false)
	@DateTimeFormat(pattern = "yyy-MM-DD HH:mm:ss")
	private Date createdAt;
	
	@DateTimeFormat(pattern = "yyy-MM-DD HH:mm:ss")
	private Date updatedAt;
	
    // ==========================
    //        RELATIONSHIPS
    // ==========================
	@OneToMany(mappedBy="noteOwner", fetch = FetchType.LAZY)
	private List<Note> notes;
	
	@OneToMany(mappedBy="cartOwner", fetch = FetchType.LAZY)
	private List<Cart> carts;
	
	@OneToMany(mappedBy="foodOwner", fetch = FetchType.LAZY)
	private List<Food> foods;
	
	@OneToMany(mappedBy="pupOwner", fetch = FetchType.LAZY)
	private List<Puppy> pups;
	
	@OneToMany(mappedBy="squishOwner", fetch = FetchType.LAZY)
	private List<Squish> squish;
	
	@OneToMany(mappedBy="stickOwner", fetch = FetchType.LAZY)
	private List<Stick> stick;
	
	
    // ==========================
    //        CONSTRUCTOR
    // ==========================
    public User() {}
	
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
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

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public List<Cart> getCarts() {
		return carts;
	}

	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public List<Puppy> getPups() {
		return pups;
	}

	public void setPups(List<Puppy> pups) {
		this.pups = pups;
	}

	public List<Squish> getSquish() {
		return squish;
	}

	public void setSquish(List<Squish> squish) {
		this.squish = squish;
	}

	public List<Stick> getStick() {
		return stick;
	}

	public void setStick(List<Stick> stick) {
		this.stick = stick;
	}
    
    
}