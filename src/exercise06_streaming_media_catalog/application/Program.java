package exercise06_streaming_media_catalog.application;

import exercise06_streaming_media_catalog.entities.MediaItem;
import exercise06_streaming_media_catalog.entities.Movie;
import exercise06_streaming_media_catalog.entities.Series;

import java.util.*;

public class Program {

    /*
    Uma plataforma de streaming precisa de um sistema para catalogar seu conteúdo. O programa deverá ler os dados de N itens de mídia (N fornecido pelo usuário),que podem ser Filmes ou Séries. O programa deverá ler os dados de N itens, armazenando todos em uma única lista. Ao final, deverá mostrar a ficha técnica de cada item do catalogo.

    A streaming platform needs a system to catalog its content. The program must read data from N media items (N provided by the user), which can be movies or series. The program must read the data from N items, storing them all in a single list. Finally, it must display the technical specifications for each item in the catalog.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<MediaItem> list = new ArrayList<>();

        System.out.print("How many items will be entered: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("Item #" + (i + 1) + ": ");
            System.out.print("Movie or Series (m/s)? ");
            char ch = scanner.next().charAt(0);
            scanner.nextLine();
            if(ch == 'm'){
                System.out.print("Title: ");
                String title = scanner.nextLine();
                System.out.print("Year of release: ");
                Integer releaseYear = scanner.nextInt();
                System.out.print("Rating: ");
                Double rating = scanner.nextDouble();
                System.out.print("Duration in minutes: ");
                Integer durationInMinutes = scanner.nextInt();
                list.add(new Movie(title, releaseYear, rating, durationInMinutes));
            }else{
                System.out.print("Title: ");
                String title = scanner.nextLine();
                System.out.print("Year of release: ");
                Integer releaseYear = scanner.nextInt();
                System.out.print("Rating: ");
                Double rating = scanner.nextDouble();
                System.out.print("Number of season: ");
                Integer numberOfSeasons = scanner.nextInt();
                System.out.print("Episodes per season: ");
                Integer episodesPerSeason = scanner.nextInt();
                list.add(new Series(title, releaseYear, rating, numberOfSeasons, episodesPerSeason));
            }
        }

        System.out.println("----- FULL CATOLOG -----");
        for(MediaItem mediaItem : list){
            mediaItem.displayDetails();
        }

        scanner.close();
    }
}
