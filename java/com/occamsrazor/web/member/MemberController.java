package com.occamsrazor.web.member;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //url 처리하는 컨트롤러
public class MemberController {
	public MemberService memberService;
	
		@PostMapping("/join")
		public Member add(@RequestBody Member member) { //controller는 무조건 응답(return)이 있어야 한다
			System.out.println(">>>>");
			System.out.println(member.toString());
			memberService = new MemberServiceImpl();
			memberService.add(member);
			return member; //return타입은 객체로
		}
}
