
package com.mycompany.movie;

class Movie {
    private String title, director;
    private String[] actors;
    private String[] reviews;

    public Movie(String title, String director, String[] actors, int maxReviews) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new String[maxReviews];
    }

    public void addReview(String review) {
        for (int i = 0; i < reviews.length; i++) {
            if (reviews[i] == null) { 
                reviews[i] = review;
                break;
            }
        }
    }

    public String[] getReviews() {
        return reviews;
    }

    public static void main(String[] args) {
        String[] actors = {"Actor1", "Actor2"};
        Movie movie = new Movie("Movie Title", "Director Name", actors, 5);

        movie.addReview("Great movie!");
        movie.addReview("Enjoyed it.");

        for (String review : movie.getReviews()) {
            if (review != null) {
                System.out.println(review);
            }
        }
    }
}
