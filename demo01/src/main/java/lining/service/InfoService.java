package lining.service;

import java.util.List;

import lining.bean.Info;

public interface InfoService {
	//public void sayHello();
	public void showMsg();
	public int insert(Info info);
	public int delete(int id);
	public int update(Info info);
	public List<Info> getInfo(int id);
}
