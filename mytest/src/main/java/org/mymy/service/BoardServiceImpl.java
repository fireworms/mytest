package org.mymy.service;

import java.util.List;

import javax.inject.Inject;

import org.mymy.dao.BoardDAO;
import org.mymy.domain.BoardVO;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	@Override
	public List<BoardVO> list() throws Exception {

		return dao.list();
	}

	@Override
	public void write(BoardVO vo) throws Exception {
		
		dao.write(vo);
	}
	
}
