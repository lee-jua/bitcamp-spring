package com.occamsrazor.web.grade;

public interface GradeService {
public void add(Grade grade);
public Grade[] list();
public Grade detail(Grade grade);
public int count();
public void update(Grade grade);
public void delete(Grade grade);
}
