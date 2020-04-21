package com.occamsrazor.web.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.occamsrazor.web.util.Messenger;

@RestController //url 처리하는 컨트롤러
@RequestMapping("/member") //요청하는 url
public class MemberController {
	@Autowired MemberService memberService; //spring container의 autowired가 bean을 자동으로 주입한다 
	
		@PostMapping("/join")
		public Messenger add(@RequestBody Member member) { //controller는 무조건 응답(return)이 있어야 한다
			int current = memberService.count();
			memberService.add(member);
			return (memberService.count()==current+1)?Messenger.SUCCESS:Messenger.FAIL; //return타입은 객체로
		}

		@PostMapping("/login")
		public Messenger login(@RequestBody Member member) {
			return memberService.login(member)?Messenger.SUCCESS:Messenger.FAIL;
		}
		
		@GetMapping("/list")
		public Member[] list() {
			return memberService.list();
		}
		
		@GetMapping("/count")
		public int count() {
			return memberService.count();
		}
		
	@GetMapping("/detail")
	public Member detail(@RequestBody String userid) {
		return memberService.detail(userid);
	}
	@GetMapping("/update")
	public Member update(@RequestBody Member member) {
		Member returnmember = new Member();
		memberService.update(member);
		return returnmember;
	
	}
	@GetMapping("/delete")
	public Member delete(@RequestBody Member member) {
		Member returnmember = new Member();
		memberService.delete(member);
		return returnmember;
	}
	
	

}