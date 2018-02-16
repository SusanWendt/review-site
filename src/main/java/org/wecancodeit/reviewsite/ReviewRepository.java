package org.wecancodeit.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review demo = new Review(0L, "demo", "imageUrl", "reviewCategory", "content", "date", "description");
		Review kino = new Review(1L, "KinoYoga", "./images/kino.jpg", "Ashtanga Yoga", "https://www.kinoyoga.com/",
				"https://www.instagram.com/kinoyoga/?hl=en", "description");
		Review aBridges = new Review(2L, "Adell Bridges", "./images/aBridges.jpg", "Vinyasa Yoga",
				"https://adellbridgesyoga.com/", "https://www.instagram.com/adellbridges/", "description");
		Review dWerner = new Review(3L, "Dylan Werner", "./images/dWerner.jpg", "Power Yoga",
				"https://www.dylanwerneryoga.com/", "https://www.instagram.com/dylanwerneryoga/", "description");

		reviews.put(demo.getId(), demo);
		reviews.put(kino.getId(), kino);
		reviews.put(aBridges.getId(), aBridges);
		reviews.put(dWerner.getId(), dWerner);
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
