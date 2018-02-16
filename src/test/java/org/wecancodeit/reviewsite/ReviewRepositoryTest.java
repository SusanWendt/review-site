package org.wecancodeit.reviewsite;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {

	private ReviewRepository underTest;

	private long firstReviewId = 45L;
	private Review firstReview = new Review(firstReviewId, "title", "imageUrl", "reviewCategory", "content", "date",
			"description");

	private long secondReviewId = 33L;
	private Review secondReview = new Review(secondReviewId, "title", "imageUrl", "reviewCategory", "content", "date",
			"description");

	@Test
	public void shouldFindFirstReview() {
		underTest = new ReviewRepository(firstReview);
		Review result = underTest.findOne(firstReviewId);
		assertThat(result, is(firstReview));
	}

	@Test
	public void shouldFindSecondReview() {
		underTest = new ReviewRepository(secondReview);
		Review result = underTest.findOne(secondReviewId);
		assertThat(result, is(secondReview));
	}

	@Test
	public void shouldFindAll() {
		underTest = new ReviewRepository(firstReview, secondReview);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstReview, secondReview));
	}
}
