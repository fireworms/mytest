package org.mymy.service;

import java.util.List;

import org.mymy.domain.BoardVO;

public interface BoardService {

	public List<BoardVO> list() throws Exception;
	
	public void write(BoardVO vo) throws Exception;
	
}
