package exercise06_streaming_media_catalog.entities;

public class Movie extends MediaItem{
    private Integer durationInMinutes;

    public Movie(){
        super();
    }

    public Movie(String name, Integer releaseYear, Double rating, Integer durationInMinutes){
        super(name, releaseYear, rating);
        this.durationInMinutes = durationInMinutes;
    }

    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }


    @Override
    public void displayDetails(){
        System.out.println("\n--- Movie ---");
        System.out.println("Title: " + getName() + " (" + getReleaseYear() + ")");
        System.out.println("Rating: " + getRating());
        System.out.println("Duration: " + durationInMinutes + " minutes");
    }

}
