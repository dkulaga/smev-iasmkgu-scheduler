package com.skat.smev.iasmkgu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SmevIasmkguSchedulerApplication extends SpringBootServletInitializer{

	/* TO COMMENT THID FOR BUILDING WAR START */
	/*public static void main(String[] args) {
		SpringApplication.run(SmevIasmkguSchedulerApplication.class, args);
	}*/
	/* TO COMMENT THIS FOR BUILDING WAR END */

	/* TO COMMENT THIS FOR RUNNING IN IDEA START */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SmevIasmkguSchedulerApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SmevIasmkguSchedulerApplication.class, args);
	}

	/* TO COMMENT THIS FOR RUNNING IN IDEA END */
}
