package com.BlueElephant.crystalball;

import java.util.Random;

public class CrystalBall {
	public String[] mAnswers = {
			"ãä ÇáÇİÖá Çä áÇ ÊÚÑİ",
			"ãä ÇáãÄßÏ ÍÏæËå",
			"ÇáÚáÇãÇÊ ßáåÇ äÚã",
			"áíÓ ãÄßÏ",
			"ÑÏì åæÇ áÇ",
			"ÕÚÈ ÍÏæËå",
			"ãä ÇáÇİÖá Çä áÇ ÊÚáã ÇáÇä",
			"ÑßÒ æÇÓÃá ãÌÏÏÇ",
			"áÇ ÇŞÏÑ Úáì ÇáÇÌÇÈå ÇáÇä",
			"áíÓ æÇÖÍ"};
	
	public String getAnAnswer(){
		
		
		String answer="";
		
		
		Random randomGenerator = new Random();
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		answer = mAnswers[randomNumber];
		
		return answer;
		
	}
}
