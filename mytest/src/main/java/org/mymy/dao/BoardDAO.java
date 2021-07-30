package org.mymy.dao;

import java.util.List;

import org.mymy.domain.BoardVO;

public interface BoardDAO {

	public List list() throws Exception;
	
	public void write(BoardVO vo) throws Exception;
}
