package org.json.junit.data;

public final class MyRecord extends Record {

	public MyRecord(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private final String name;
	private final int age;

	public final String name() {
		return name;
	}

	public final int age() {
		return age;
	} 
}
