package com.example.wosmartprojc.models;

@Entity
@Table(name="categorys")
public class Category {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @NotBlank(message="Name is required!")
    @Size(min=3, max=30, message="Name must be between 2 and 30 characters")
	private String name;



    @Column(updatable=false)
	@DateTimeFormat(pattern = "yyy-MM-DD HH:mm:ss")
	private Date createdAt;
	
	@DateTimeFormat(pattern = "yyy-MM-DD HH:mm:ss")
	private Date updatedAt;


    // ==========================
    //        RELATIONSHIPS
    // ==========================

    // ==========================
    //        CONSTRUCTOR
    // ==========================

    public Category() {}

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
