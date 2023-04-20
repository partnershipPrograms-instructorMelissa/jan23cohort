package com.example.wosmartprojc.models;

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
}
