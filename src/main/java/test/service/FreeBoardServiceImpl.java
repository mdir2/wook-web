package test.service;

import java.util.List;

import javax.annotation.Resource;

import test.dto.FreeBoardDto;
import wook.web.annotation.Repository;
import wook.web.common.dbcp.SqlSessionTemplate;

@Repository
public class FreeBoardServiceImpl implements FreeBoardService {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public int totalCountByFreeBoard(String queryId) {
		return (int) sqlSessionTemplate.selectOne(queryId);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<FreeBoardDto> selectListByFreeBoard(String queryId, FreeBoardDto dto) {
		return (List<FreeBoardDto>) sqlSessionTemplate.selectList(queryId, dto);
	}
}