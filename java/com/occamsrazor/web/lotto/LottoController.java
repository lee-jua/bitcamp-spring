package com.occamsrazor.web.lotto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamsrazor.web.util.Messenger;
import com.occamsrazor.web.util.Prize;

@RestController
@RequestMapping("/lotto") 
public class LottoController {   
	@Autowired LottoService lottoService;
	
	@PostMapping("/buy/{lotto}")    //key 스트링
	public Messenger buy(@PathVariable String lotto) {  //value 객체
		int current = lottoService.count();
		String[] lottos = lotto.split(",");
		Lotto arr = new Lotto();
		arr.setUserid(lottos[0]);
		arr.setFirst(lottos[1]);
		arr.setSecond(lottos[2]);
		arr.setThird(lottos[3]);
		arr.setForth(lottos[4]);
		arr.setFifth(lottos[5]);
		 lottoService.add(arr);
		
		return lottoService.count()==current+1? Messenger.SUCCESS : Messenger.FAIL;
	}
	@GetMapping("/prize/{userid}")
	public Prize prize(@PathVariable String userid) {
		
		return lottoService.detail(userid);
	}
}
