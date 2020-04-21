package com.occamsrazor.web.member;

public interface MemberService {
public void add(Member member);
public Member[] list();
public boolean login(Member member);
public Member detail(String userid);
public Member[] SearchByName(String name);
public Member[] SearchByGender(String ssn);
public int count();
public int namecount(String name);
public int gendercount(String ssn);
public void update(Member member);
public void delete(Member member); 
}
