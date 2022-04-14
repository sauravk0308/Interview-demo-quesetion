package com.interview.question.factory;

public class FactoryPatternMainClass {

	public static void main(String[] args) {
		
		Profession profession = ProfessionFatory.getProfession(ProessionEnum.DOCTOR);
		profession.print();
	}

}
