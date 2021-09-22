package br.com.mateus.clean_architecture.endpoint;

import java.time.LocalDateTime;

public class Recommendation {
	private Student recommender;
	private Student recommended;
	private LocalDateTime date;

	public Recommendation(Student recommender, Student recommended) {
		this.recommended = recommended;
		this.recommender = recommender;
		this.date = LocalDateTime.now();
	}

	public Student getRecommender() {
		return recommender;
	}

	public Student getRecommended() {
		return recommended;
	}

	public LocalDateTime getDate() {
		return date;
	}

}
