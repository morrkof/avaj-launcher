package ru.school21.avajlauncher;

public abstract class Aircraft {
	protected long id;
	protected String name;
	protected Coordinates coordinates;
	private static long idCounter;
	
	protected Aircraft(String name, Coordinates coordinates) {
		
	}
	
	protected long nextId() {
		
	}
}
