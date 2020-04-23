package com.occamsrazor.web.lotto;


import java.util.Random;

import org.springframework.stereotype.Service;

import com.occamsrazor.web.util.Prize;

@Service
public class LottoServiceImpl implements LottoService{
private Lotto[] lottos;
private int count;
public LottoServiceImpl() {
	lottos = new Lotto[5];
	count=0;
}
	@Override
	public void add(Lotto lotto) {
		lottos[count]=lotto;
		count++;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public Prize detail(String userid) {
	Prize prize = null;
	switch(lottocount(userid)) {
	case 0: prize = Prize.꽝; break;
	case 1: prize = Prize.오등; break;
	case 2: prize = Prize.사등; break;
	case 3: prize = Prize.삼등; break;
	case 4: prize = Prize.이등; break;
	case 5: prize = Prize.일등; break;

		
	}
	
		return prize;
	}
	private int lottocount(String userid) {
		Random r = new Random();
		int lottoCount=0;
		int[] randomLotto=new int[5];
		for (int i = 0; i < count; i++) {
			if (userid.equals(lottos[i].getUserid())) {
				for (int j = 0; j < 5; j++) {
					randomLotto[j] = r.nextInt(5)+1;
					System.out.println("랜덤 로또 번호 "+j + "번째:" +randomLotto[j]);
				
						}
				if (randomLotto[0]==Integer.parseInt(lottos[i].getFirst())) {
					lottoCount++;

				}
				if(randomLotto[1]==Integer.parseInt(lottos[i].getSecond())){
					lottoCount++;
				}
				if(randomLotto[2]==Integer.parseInt(lottos[i].getThird())) {
					lottoCount++;
				}
				if(randomLotto[3]==Integer.parseInt(lottos[i].getForth())) {
					lottoCount++;	
				}
				if(randomLotto[4]==Integer.parseInt(lottos[i].getFifth())) {
					lottoCount++;
					}
				break;
				
				
				}
			
			
				}
			
		
			
			System.out.println("맞은 개수 : "+ lottoCount);
		return lottoCount;
	}

}
