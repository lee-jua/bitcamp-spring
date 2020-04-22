package com.occamsrazor.web.lotto;

import com.occamsrazor.web.util.Prize;

public interface LottoService {
	public void add(Lotto lotto);
	public int count();
	public Prize detail(String userid);
}
