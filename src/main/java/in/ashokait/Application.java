package in.ashokait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		//Changes for HIS-134
		run.close();
	}


        // HIS-200 realated changes
        public void doProcess(){

            //Logic goes here       

        }

}
