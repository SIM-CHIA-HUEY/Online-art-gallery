package com.project.gallery;

import com.project.gallery.domain.entities.Artwork;
import com.project.gallery.domain.entities.Availabilities;
import com.project.gallery.repositories.ArtworkRepository;
import com.project.gallery.repositories.AvailabilitiesRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GalleryApplication {

    @Autowired
    //private ArtworkRepository repo;
    private AvailabilitiesRepository repoAvailabilities;

    public static void main(String[] args) {
        SpringApplication.run(GalleryApplication.class, args);
    }

    /*
    @Bean
    InitializingBean sendDataBase() {
        return () -> {
            Artwork art1 = new Artwork();
            art1.setDescription("MyDescription");
            art1.setPrice(1000);
            art1.setTitle("my Art");
            art1.setPublic(true);
            art1.setProductionQuantity(10);
            repo.save(art1);
        };
   }

     */

   @Bean
    InitializingBean sendDatabase(){
        return() -> {
            Availabilities availabilitiesOne = new Availabilities();
            availabilitiesOne.setAvailabilitiesCode(1L);
            availabilitiesOne.setAvailabilitiesName("À vendre");
            repoAvailabilities.save(availabilitiesOne);
            Availabilities availabilitiesTwo = new Availabilities();
            availabilitiesTwo.setAvailabilitiesCode(2L);
            availabilitiesTwo.setAvailabilitiesName("Pas à vendre");
            repoAvailabilities.save(availabilitiesTwo);
        };
   }








}
