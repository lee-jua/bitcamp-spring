package com.occamsrazor.web.grade;

import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService{
private Grade[] grades;
private int count;

public GradeServiceImpl() {
	grades = new Grade[5];
	count = 0;
}
	@Override
	public void add(Grade grade) {
		grades[count]=grade;
		count++;
		
	}

	@Override
	public Grade[] list() {
		return grades;
	}


	@Override
	public int count() {
		return count;
	}

	@Override
	public void update(Grade grade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Grade grade) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Grade detail(Grade grade) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
