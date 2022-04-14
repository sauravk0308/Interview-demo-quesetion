package com.interview.question;

import java.io.Serializable;

public class SingletonExample implements Serializable, Cloneable {

	private static SingletonExample instance;

	private SingletonExample() {
		if (instance != null) {
			throw new IllegalStateException("object can't be create using reflection");
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	protected Object readResolve() {
		return instance;
	}

	public static synchronized SingletonExample getInstance() {
		if (instance == null) {
			return instance = new SingletonExample();
		} else {
			return instance;
		}
	}

}
