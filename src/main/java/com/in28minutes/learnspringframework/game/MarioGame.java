package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component	// this basically tells spring framework to manage the mario game
public class MarioGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.println("jump");
	}
	
	@Override
	public void down() {
		System.out.println("go into a hole");
	}
	
	@Override
	public void left() {
		System.out.println("stop");
	}
	
	@Override
	public void right() {
		System.out.println("go faster");
	}
	
}
