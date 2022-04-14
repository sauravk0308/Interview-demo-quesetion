package com.interview.question.factory;

public class ProfessionFatory {

	public static Profession getProfession(ProessionEnum profession ) {
		switch(profession) {
			case ENGINEER:
				return new Engineer();
			case DOCTOR:
				return new Doctor();
			case TEACHER:
				return new Teacher();
			default:
				return null;
		}
	}
}
