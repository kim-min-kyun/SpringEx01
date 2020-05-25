package com.company01.springEx01.service;

import java.util.List;
import com.company01.springEx01.logic.Board;

public interface BoardService {
	
	Board getBoardDetail(int id);
	void viewsUpdate(int id);
	int boardwrite(Board board);
	List<Board> getBoardList();
}
