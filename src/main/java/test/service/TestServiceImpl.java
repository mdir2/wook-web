package test.service;

import java.util.Map;

import javax.annotation.Resource;

import test.dto.FreeBoardDto;
import wook.web.annotation.Repository;
import wook.web.common.dbcp.SqlSessionTemplate;

@Repository
public class TestServiceImpl implements TestService {
	
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public FreeBoardDto selectOneByFreeBoard(String queryId, FreeBoardDto dto) {
		return (FreeBoardDto) sqlSessionTemplate.selectOne(queryId, dto);
	}

	@Override
	public FreeBoardDto selectOneByFreeBoardMap(String queryId, Map<String, Object> paramMap) {
		return (FreeBoardDto) sqlSessionTemplate.selectOne(queryId, paramMap);
	}
}