package com.example.wosmartprojc.models;

@Entity
@Table(name="carts")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


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

    public Cart() {}

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
