package com.in28minutes.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;

@SpringBootApplication		// simplifies initialization of Spring based applications
// when @SpringBootApplication is written in a class only the packages within this package and all subpackages
// will be handled via Spring Framework; OR we use the component scan annotation if we want to integrate other packages:
// Ex.: @ComponentScan({"com.in28minutes.learnspringframework", "com.in28minutes.dummy"})

public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		//MarioGame, GameRunner
		GameRunner runner = context.getBean(GameRunner.class);
		
//		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
//		GameRunner runner = new GameRunner(game);	
		runner.runGame();
//		
	}
}
