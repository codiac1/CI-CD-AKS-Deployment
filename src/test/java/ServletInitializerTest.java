import com.example.javaease.ServletInitializer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.builder.SpringApplicationBuilder;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ServletInitializerTest {

    @Test
    void testConfigure() {
        ServletInitializer servletInitializer = new ServletInitializer();
        SpringApplicationBuilder builder = servletInitializer.configure(new SpringApplicationBuilder());
        assertNotNull(builder);
    }
}