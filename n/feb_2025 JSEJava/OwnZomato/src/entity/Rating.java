package entity;

import java.util.ArrayList;
import java.util.List;

public class Rating {
	private List<Integer> ratings;
	private List<String> comments;
	private int totalRatings; // sum of all num of ratings / count

	public Rating() {
		ratings = new ArrayList<Integer>();
		comments = new ArrayList<String>();
	}

//	public Rating(List<Integer> ratings, List<String> comments, int totalRatings) {
//		super();
//		this.ratings = ratings;
//		this.comments = comments;
//		this.totalRatings = totalRatings;
//	}

	public List<Integer> getRatings() {
		return ratings;
	}

	public void setRatings(List<Integer> ratings) {
		this.ratings = ratings;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Rating [ratings=" + ratings + ", comments=" + comments + ", totalRatings=" + totalRatings + "]";
	}

	public void rateAndCommentResturant(int star, String comments) {
		ratings.add(star);
		this.comments.add(comments);
//		_________________________________
		totalRatings += star;
	}

	public float cakculateRatingAverage() {
		if (ratings.size() > 0)
			return totalRatings / ratings.size();
		return 0;
	}

}
