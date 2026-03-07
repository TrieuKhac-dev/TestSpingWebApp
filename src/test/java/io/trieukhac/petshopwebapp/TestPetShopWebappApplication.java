package io.trieukhac.petshopwebapp;

import org.springframework.boot.SpringApplication;

public class TestPetShopWebappApplication {

  public static void main(String[] args) {
    SpringApplication.from(PetShopWebappApplication::main)
        .with(TestcontainersConfiguration.class)
        .run(args);
  }
}
