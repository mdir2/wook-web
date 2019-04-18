package test.service;

import java.util.List;

import test.dto.FreeBoardDto;
import wook.web.annotation.Service;

@Service
public interface FreeBoardService {
	public int totalCountByFreeBoard(String queryId);
	public List<FreeBoardDto> selectListByFreeBoard(String queryId, FreeBoardDto dto);
}
