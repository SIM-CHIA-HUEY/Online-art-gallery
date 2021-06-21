package com.project.gallery;

import com.project.gallery.domain.entities.Availabilities;
import com.project.gallery.domain.entities.Categories;
import com.project.gallery.repositories.AvailabilitiesRepository;
import com.project.gallery.repositories.CategoriesRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GalleryApplication {

    @Autowired
    private AvailabilitiesRepository repoAvailabilities;
    private CategoriesRepository repoCategories;

    public GalleryApplication(AvailabilitiesRepository repoAvailabilities, CategoriesRepository repoCategories) {
        this.repoAvailabilities = repoAvailabilities ;
        this.repoCategories = repoCategories;
    }


    public static void main(String[] args) {
        SpringApplication.run(GalleryApplication.class, args);
    }


   @Bean
    InitializingBean sendDatabaseAvailabilitiesTable(){
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


   @Bean
    InitializingBean sendDatabaseCategoriesTable(){
       return() -> {
           Categories categoriesStyleOne = new Categories();
           categoriesStyleOne.setCategoryCode(101L);
           categoriesStyleOne.setCategoryName("Abstrait");
           repoCategories.save(categoriesStyleOne);

           Categories categoriesStyleTwo = new Categories();
           categoriesStyleTwo.setCategoryCode(102L);
           categoriesStyleTwo.setCategoryName("Art Numérique");
           repoCategories.save(categoriesStyleTwo);

           Categories categoriesTechnicOne = new Categories();
           categoriesTechnicOne.setCategoryCode(201L);
           categoriesTechnicOne.setCategoryName("Peinture");
           repoCategories.save(categoriesTechnicOne);

           Categories categoriesTechnicTwo = new Categories();
           categoriesTechnicTwo.setCategoryCode(202L);
           categoriesTechnicTwo.setCategoryName("Sculpture");
           repoCategories.save(categoriesTechnicTwo);

           Categories categoriesMediumOne = new Categories();
           categoriesMediumOne.setCategoryCode(301L);
           categoriesMediumOne.setCategoryName("Installation");
           repoCategories.save(categoriesMediumOne);

           Categories categoriesMediumTwo = new Categories();
           categoriesMediumTwo.setCategoryCode(302L);
           categoriesMediumTwo.setCategoryName("Photographie");
           repoCategories.save(categoriesMediumTwo);

           Categories categoriesTopicOne = new Categories();
           categoriesTopicOne.setCategoryCode(401L);
           categoriesTopicOne.setCategoryName("Power");
           repoCategories.save(categoriesTopicOne);

           Categories categoriesTopicTwo = new Categories();
           categoriesTopicTwo.setCategoryCode(402L);
           categoriesTopicTwo.setCategoryName("Love");
           repoCategories.save(categoriesTopicTwo);
       };
   }










}
