package com.drk.exception;

public class MovieExceptions {

	public static class MovieNotFoundException extends RuntimeException {
		public MovieNotFoundException(String message) {
			super(message);
		}
	}
}
