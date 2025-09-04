package exercise06_streaming_media_catalog.entities;

public abstract class MediaItem {
    private String name;
    private Integer releaseYear;
    private Double rating;

    public MediaItem(){
    }

    public MediaItem(String name, Integer releaseYear, Double rating){
        this.name = name;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRating() {
        return rating;
    }

    public void setRate(Double rating) {
        this.rating = rating;
    }

    public abstract void displayDetails();
}
