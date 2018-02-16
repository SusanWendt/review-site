package org.wecancodeit.reviewsite;

public class Review {
	private Long id;
	private String title;
	private String imageUrl;
	private String reviewCategory;
	private String content;
	private String date;
	private String description;
	
	

	public Review(Long id, String title, String imageUrl, String reviewCategory, String content, String date,
			String description) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.reviewCategory = reviewCategory;
		this.content = content;
		this.date = date;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getReviewCategory() {
		return reviewCategory;
	}

	public String getContent() {
		return content;
	}

	public String getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}
}
