package tc.tc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TcApplication {

    public static void main(String[] args) {
        SpringApplication.run(TcApplication.class, args);
    }
}
