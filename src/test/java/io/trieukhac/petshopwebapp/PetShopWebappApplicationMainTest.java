package io.trieukhac.petshopwebapp;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;

class PetShopWebappApplicationMainTest {

  @Test
  void runApp_startsAndClosesContext() {
    // truyền args rỗng; runApp đã set WebApplicationType.NONE nên không khởi web server
    try (ConfigurableApplicationContext ctx = PetShopWebappApplication.runApp(new String[] {})) {
      assertNotNull(ctx); // đảm báo context được tạo
      assertTrue(ctx.isActive());
    }
  }
}
