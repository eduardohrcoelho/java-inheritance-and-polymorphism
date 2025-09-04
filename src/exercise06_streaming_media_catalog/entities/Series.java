package exercise06_streaming_media_catalog.entities;

public class Series extends MediaItem{
    private Integer numberOfSeasons;
    private Integer episodesPerSeason;

    public Series(){
        super();
    }

    public Series(String name, Integer releaseYear, Double rating, Integer numberOfSeasons, Integer episodesPerSeason) {
        super(name, releaseYear, rating);
        this.numberOfSeasons = numberOfSeasons;
        this.episodesPerSeason = episodesPerSeason;
    }

    public Integer getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(Integer numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public Integer getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(Integer episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public Integer getTotalDurationInMinutes(){
        return numberOfSeasons * episodesPerSeason * 45;
    }

    @Override
    public void displayDetails(){
        System.out.println("\n--- Series ---");
        System.out.println("Title: " + getName() + " (" + getReleaseYear() + ")");
        System.out.println("Rating: " + getRating());
        System.out.println("Seasons: " + getNumberOfSeasons() + "( total duration approx. " + getTotalDurationInMinutes() + ")");
    }

}
