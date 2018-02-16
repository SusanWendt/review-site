package org.wecancodeit.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review kino = new Review(1L, "KinoYoga", "./images/kino.jpg", "reviewCategory", "content", "date", "description");
		Review aBridges = new Review(2L, "Adell Bridges", "./images/aBridges.jpg", "reviewCategory", "content", "date", "description");

		reviews.put(kino.getId(), kino);
		reviews.put(aBridges.getId(), aBridges);
	}

	public Review findOne(Long id) {
		return reviews.get(id);
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public ReviewRepository(Review... reviews) {
		populateReviewsMap(reviews);
	}

	private void populateReviewsMap(Review... reviews) {
		for (Review review : reviews) {
			this.reviews.put(review.getId(), review);
		}
	}

}
