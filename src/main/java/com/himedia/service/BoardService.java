package com.himedia.service;


import java.util.List;

import com.himedia.domain.BoardVO;

public interface BoardService {

	String hello(String name);

	BoardVO getBoard();

	List<BoardVO> getBoardList();

}
