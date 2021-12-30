package com.azure.function.poc;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class GreetingFunction implements Function<String, String> {
	
	@Override
	public String apply(String name) {
		return "Welcome, " + name;
	}
}
