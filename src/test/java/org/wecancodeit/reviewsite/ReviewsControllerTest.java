package org.wecancodeit.reviewsite;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class ReviewsControllerTest {

	private static final long REVIEW_ID = 0L;

	@InjectMocks
	private ReviewsController underTest;

	@Mock
	private ReviewRepository repository;

	@Mock
	private Model model;

	@Mock
	private Review review;

	@Mock
	private Review anotherReview;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldAddASingleReviewToModel() {
		when(repository.findOne(REVIEW_ID)).thenReturn(review);
		underTest.getAReview(REVIEW_ID, model);
		verify(model).addAttribute("reviews", review);
	}

	@Test
	public void shouldReturnNameOfSingleReviewTemplate() {
		String result = underTest.getAReview(REVIEW_ID, model);
		assertThat(result, is("review"));
	}
	
	@Test
	public void shouldAddAllReviewsToModel() {
		Collection<Review> allReviews = Arrays.asList(review, anotherReview);
		when(repository.findAll()).thenReturn(allReviews);		
		underTest.getAllReviews(model);
		verify(model).addAttribute("reviews", allReviews);
	}
	
	@Test
	public void shouldReturnNameOfAllReviewsTemplate() {
		String result = underTest.getAllReviews(model);
		assertThat(result, is("reviews"));	}
}
