package com.occamsrazor.web.grade;

import com.occamsrazor.web.util.Credit;

public interface GradeService {
public void add(Grade grade);
public Grade[] list();
public int count();
public void update(Grade grade);
public void delete(Grade grade);
public Credit detail(String userid);
}
