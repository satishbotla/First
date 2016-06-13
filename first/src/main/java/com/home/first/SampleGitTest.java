package com.home.first;

public class SampleGitTest {
	public static void main(String[] args) {
		
		System.out.println("GIT checkin checkout practice");
		User user = new AccountUser();
		System.out.println("Account user::"+user.getName());
		System.out.println("Next update");
		System.out.println("NEW LINE ADDED WELL MERGE SHOULD FAIL");
		System.out.println("ANOTHER NEW LINE ADDED FOR MERGE");
	}
}
