package test.web;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import test.dto.FreeBoardDto;
import test.service.FreeBoardService;
import test.service.TestService;
import wook.web.annotation.Controller;
import wook.web.annotation.RequestMapping;

@Controller
public class FreeBoardControllerB {
	@Resource
	public TestService testService;
	
	@Resource
	public FreeBoardService freeBoardService;
	
	@RequestMapping("/main2")
	public String main(HttpServletRequest request, FreeBoardDto dto) {
		String url = request.getRequestURI();
		int totalCount = freeBoardService.totalCountByFreeBoard("totalCountByFreeBoard");
		dto.setUrl(url);
		dto.setEndPage(totalCount);
		
		List<FreeBoardDto> resultList = freeBoardService.selectListByFreeBoard("selectListByFreeBoard", dto);
		request.setAttribute("resultList", resultList);
		request.setAttribute("pagination", dto.getPagination());
		return "list";
	}
	
	@RequestMapping("/detail2")
	public String detail(HttpServletRequest request, HashMap<String, Object> paramMap) {
		FreeBoardDto dto = testService.selectOneByFreeBoardMap("selectOneByFreeBoardMap", paramMap);
		request.setAttribute("dto", dto);
		return "detail";
	}
}
