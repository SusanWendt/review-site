package org.wecancodeit.reviewsite;

public class Review {
	private Long id;
	private String title;
	private String name; 
	private String imageUrl;
	private String reviewCategory;
	private String website;
	private String insta;
	private String description;

	public Review(Long id, String title, String name, String imageUrl, String reviewCategory, String website, String insta,
			String description) {
		this.id = id;
		this.title = title;
		this.name = name;
		this.imageUrl = imageUrl;
		this.reviewCategory = reviewCategory;
		this.website = website;
		this.insta = insta;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public String getName() {
		return name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getReviewCategory() {
		return reviewCategory;
	}

	public String getWebsite() {
		return website;
	}

	public String getInsta() {
		return insta;
	}

	public String getDescription() {
		return description;
	}
}
