package de.fb;

import java.util.UUID;

import com.google.common.collect.Maps;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class UserRegistrationApplication extends Application<UserRegistrationConfig> {


	public static void main(String[] args) throws Exception {
		new UserRegistrationApplication().run(args);
	}
	
	@Override
	public void initialize(Bootstrap<UserRegistrationConfig> bootstrap) {
		super.initialize(bootstrap);
	}
	
	@Override
	public void run(UserRegistrationConfig conf, Environment env) throws Exception {
		
		UserRegistrationResource resource = new UserRegistrationResource(Maps.<UUID,User>newHashMap());
		
		env.jersey().register(resource);
	}


}
