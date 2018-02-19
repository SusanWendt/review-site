package org.wecancodeit.reviewsite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review yogaJournal = new Review(0L, "Yoga Journal", "Yoga Journal", "./images/dogYoga.jpg", "Yoga Resource",
				"https://www.yogajournal.com/yoga-101", "https://www.instagram.com/yogajournal/",
				"Yoga Journal is a great resource for any question. I consider it an encyclopedia of sorts that references other articles. ");
		Review kino = new Review(1L, "Kino Yoga", "Kino MacGregor", "./images/kino.jpg", "Ashtanga Yoga",
				"https://www.kinoyoga.com/", "https://www.instagram.com/kinoyoga/?hl=en",
				"Kino MacGregor is my number one yogi to follow. "
						+ "She incorpates the history, philosohpy, and more traditional lineages of yoga and makes them accesible to modern day wellness enthusiasts. "
						+ "Her style is ahstanga, which is a style developed by Sri K. Pattabhi Jois in the 20th century based around the eight limbed bath of yoga decribed in the Yoga Sutras.");
		Review aBridges = new Review(2L, "Adell Bridges Yoga", "Adell Bridges", "./images/aBridges.jpg", "Vinyasa Yoga",
				"https://adellbridgesyoga.com/", "https://www.instagram.com/adellbridges/",
				"Adell Bridges is newer to teaching yoga, but she has a strong understanding of alignment and body awareness. "
						+ "So her description of poses and correcting alignment are spot on. "
						+ "Her skill in this augmented from her background as a competive gymnast.");
		Review dWerner = new Review(3L, "Dylan Werner Yoga", "Dylan Werner", "./images/dWerner.jpg", "Power Yoga",
				"https://www.dylanwerneryoga.com/", "https://www.instagram.com/dylanwerneryoga/",
				"Dylan Werner practices vinyasa style yoga, primarily power and some Yin. "
						+ "He has a successful cody app online and travels most of the year.");

		Review corePower = new Review(4L, "CorePower Yoga", "CorePower", "./images/corePower.jpg", "Yoga Studio",
				"https://www.corepoweryoga.com/", "https://www.instagram.com/corepoweryoga/?hl=en",
				"This is a nationally branded yoga studio. Headquartered in Denver, Core Power has over 170 studios throughout the US. "
						+ "Columbus houses two studios: one at the Easton Shoping Center and one in the Short North. "
						+ "Benefits of joining this studio injclude that the membership is valid at all studios. "
						+ "Another luxury is the fully equipped locker room including stocked showers, towels, mat rentals, among other amentities."
						+ "All classes are hot (80+ degrees) and there are four types of calsses: C1, C2, HPF, and Sculpt. "
						+ "C1: Core 1 is the most accesible class designed for beginners or a recovery day. "
						+ "C2: Core 2 is targetted towards students who already have a developed yoga practice. "
						+ "HPF: Hot Power Flow is the hottest class led in candlelight and incorpates more traditional yoga elements. "
						+ "Sculpt is the most modern variation offered that utilizes weights within the flow for added difficulty. "
						+ "Additionally there are various Workshops such as Arm Balance and Inversion, Restorative, Diwali, Solstice, Etc."
						+ "The first week is free for new students.");

		Review yohi = new Review(5L, "Yoga on High", "YOHI", "./images/yohi.jpg", "Yoga Studio",
				"http://yogaonhigh.com/", "https://www.instagram.com/yogaonhigh/",
				"This yoga studio is where I did my teacher training. "
						+ "It has three different locations and is the most comprehensive studio in Columbus, "
						+ "offering Vinyasa, Hatha, Ashtanga, Mysore, Restorative, Maternity, Kids yoga, free community yoga, and many more.");

		reviews.put(yogaJournal.getId(), yogaJournal);
		reviews.put(kino.getId(), kino);
		reviews.put(aBridges.getId(), aBridges);
		reviews.put(dWerner.getId(), dWerner);
		reviews.put(corePower.getId(), corePower);
		reviews.put(yohi.getId(), yohi);
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
