package com.ysh.mapex.mscore;

import java.io.IOException;
import java.io.*;

public interface Score {

	// 추가, 수정, 검색, 삭제, 전체출력(학번순), 전체출력(정렬)

	public int insert() throws IOException;

	public int update() throws IOException;

	public void search() throws IOException;

	public int delete() throws IOException;

	public void writeAll();

	public void writeSort();
	//출력하기 위해서는 구현체가 필요!
	

}
