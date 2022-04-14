package com.interview.question;
public class ComparableExample implements Comparable<ComparableExample> {

  String firstName;
  String lastName;
  String bookName;
  ComparableExample(String first, String last, String book){
	this.firstName = first;
	this.lastName = last;
	this.bookName = book;
  }
	
  @Override
  public int compareTo(ComparableExample au){
     int last = this.lastName.compareTo(au.lastName);
     return last == 0 ? this.firstName.compareTo(au.firstName) : last;
  }
}