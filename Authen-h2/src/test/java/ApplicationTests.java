

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void test(){
		StandardPasswordEncoder encoder = new StandardPasswordEncoder();
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		//System.out.println(bcrypt.matches("admin", "e6daa70e762025ea4b156e1fffc6627315a28e552d475ee36a83d008fe1df38f454f1856e9f503b9"));
		//System.out.println(bcrypt.matches("user", "$2a$10$1i9b7DU31U1NXIdBKoMoEezuZ5MHj4hKpFi47cDdguksUry80Y8pK"));
		//System.out.println(bcrypt.matches("ameizi", "b7be336bc3325eb15f894897230cf67d7011b851f7db3399dd0053700faa72a28bdc75eaa5539361"));
		System.out.println("---->"+new BCryptPasswordEncoder().encode("admin"));
		System.out.println("---->"+new BCryptPasswordEncoder().encode("user"));
		System.out.println("---->"+new BCryptPasswordEncoder().encode("ameizi"));
	}
}
