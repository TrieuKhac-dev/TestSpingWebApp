package io.trieukhac.petshopwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PetShopWebappApplication {

  // Testable entry point: trả về context để test có thể đóng nó an toàn
  public static ConfigurableApplicationContext runApp(String[] args) {
    SpringApplication app = new SpringApplication(PetShopWebappApplication.class);
    // important: avoid starting embedded web server in unit tests
    app.setWebApplicationType(WebApplicationType.NONE);
    return app.run(args);
  }

  public static void main(String[] args) {
    // giữ main nhẹ, gọi vào runApp
    runApp(args);
  }

  //  public static void main(String[] args) {
  //    SpringApplication.run(PetShopWebappApplication.class, args);
  //  }
}
