package com.BlueElephant.crystalball;

import java.util.Random;

public class CrystalBall {
	public String[] mAnswers = {
			"�� ������ �� �� ����",
			"�� ������ �����",
			"�������� ���� ���",
			"��� ����",
			"��� ��� ��",
			"��� �����",
			"�� ������ �� �� ���� ����",
			"��� ����� �����",
			"�� ���� ��� ������� ����",
			"��� ����"};
	
	public String getAnAnswer(){
		
		
		String answer="";
		
		
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		answer = mAnswers[randomNumber];
		
		return answer;
		
	}
}
