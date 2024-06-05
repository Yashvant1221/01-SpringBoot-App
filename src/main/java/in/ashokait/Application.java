package in.ashokait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

        private Map<String, Object> cache = new HashMap<String, Object>();

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		//Changes for HIS-134
		run.close();
                
                int a = 10;
	}


         // HIS-301 related changes
         public void loadDataToCatche(){

             //Logic goes here

         }

}
