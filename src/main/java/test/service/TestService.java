package test.service;

import java.util.Map;

import test.dto.FreeBoardDto;
import wook.web.annotation.Service;

@Service
public interface TestService {
	public FreeBoardDto selectOneByFreeBoard(String queryId, FreeBoardDto dto);
	public FreeBoardDto selectOneByFreeBoardMap(String queryId, Map<String, Object> paramMap);
}
