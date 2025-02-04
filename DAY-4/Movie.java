public class Movie {
    String movieTitle;
    String genre;
    int duration;
    int rating;

    public Movie(String movieTitle, String genre, int duration, int rating) {
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    public String viewTitle() {
        return movieTitle;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "Sci-fi", 148, 5);
        Movie movie2 = new Movie("Interstellar", "Sci-fi", 150, 5);

        System.out.println("Movie 1 Title: " + movie1.viewTitle());
        System.out.println("Movie 2 Title: " + movie2.viewTitle());
    }
}
