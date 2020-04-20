package com.occamsrazor.web.member;

public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;
public MemberServiceImpl() {
	members = new Member[5] ;
	count = 0;
}
	@Override
	public void add(Member member) {
	members[count] = member;
	count++;
		
	}

	@Override
	public Member[] list() {
		return members;
	}

	@Override
	public Member detail(String userid) {
		Member returnmember = null;
		for (int i = 0; i < count; i++) {
			if (userid.equals(members[i].getUserid())) {
				returnmember = new Member();
				returnmember = members[i];
				break;
			}
		}
		return returnmember;
	}

	@Override
	public Member[] SearchByName(String name) {
		Member[] returnmembers = null;
		if (namecount(name)!=0) {
			returnmembers = new Member[namecount(name)];
			int j=0;
			for (int i = 0; i < count; i++) {
				if (name.equals(members[i].getUserid())) {
					returnmembers[j] = members[i];
							j++;
					if (namecount(name)==j) {
						break;
					}
				}
			}
		}
		return returnmembers;
	}

	@Override
	public Member[] SearchByGender(String ssn) {
		Member[] returnmembers = null;
		if (gendercount(ssn)!=0) {
			returnmembers = new Member[gendercount(ssn)];
			int j=0;
			for (int i = 0; i < count; i++) {
				if (ssn.charAt(7)==(members[i].getSsn().charAt(7))) {
					returnmembers[j] = members[i];
							j++;
					if (gendercount(ssn)==j) {
						break;
					}
				}
			}
		}
		return returnmembers;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public int namecount(String name) {
	int searchcount = 0;
	for (int i = 0; i < count; i++) {
		if (name.equals(members[i].getName())) {
			searchcount++;
		}
	}
		return searchcount;
	}

	@Override
	public int gendercount(String ssn) {
		int searchcount = 0;
		for (int i = 0; i < count; i++) {
			if (ssn.charAt(7)==members[i].getSsn().charAt(7)) {
				searchcount++;
			}
		}
			return searchcount;
		}

	@Override
	public Member login(Member member) {
		Member returnmember = new Member();
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())&& member.getPasswd().equals(members[i].getPasswd())) {
				returnmember = members[i];
				break;
			}
		}
		return returnmember;
	}

	@Override
	public void update(Member member) {
			for (int i = 0; i < count; i++) {
				if (member.getUserid().equals(members[i].getUserid())) {
					members[i].setPasswd(member.getPasswd());
					break;
				}
			}
	
	}


	@Override
	public void delete(Member member) {
		for (int i = 0; i < count; i++) {
			if (member.getUserid().equals(members[i].getUserid())) {
				members[i].setPasswd(member.getPasswd());
				members[i]=members[count-1];
				members[count-1]=null;
				count--;
				break;
	}

}
	}
	}
