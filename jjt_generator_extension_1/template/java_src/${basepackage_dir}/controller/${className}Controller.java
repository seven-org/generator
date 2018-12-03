<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>

package ${basepackage}.controller;

import io.swagger.annotations.Api;
import com.github.pagehelper.Page;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import ${basepackage}.base.component.component.JsonResponse;
import ${basepackage}.base.component.component.PageJsonResponse;
import ${basepackage}.base.component.component.Pagenation;
import ${basepackage}.base.component.utils.ResultUtils;
import ${basepackage}.base.dto.${className}DTO;
import ${basepackage}.base.service.${className}Service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

/**
 * createTime: <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
 * @author ${author}
 * @version
 */
@Api(value="${table.remarks} controller",tags={"${table.remarks} 相关操作接口"})
@RestController
@RequestMapping("/${version}/")
public class ${className}Controller {

	@Autowired
	private ${className}Service  ${classNameLower}Service;

	/**
	 * 
	 * @date <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
	 * @Title: findByPage 
	 * @Description: TODO
	 * @param @param ${classNameLower}
	 * @param @param pagenation
	 * @param @param request
	 * @param @return
	 * @return PageJsonResponse<List<${className}>>
	 * @throws
	 */
	@RequestMapping(value="${classNameLower}s", method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE+";charset=utf-8"})
	public PageJsonResponse<List<${className}DTO>> findByPage(${className}DTO ${classNameLower}, Pagenation pagenation, HttpServletRequest request, Model model) {
		Page<${className}DTO> queryResultList = ${classNameLower}Service.findListByPage(${classNameLower}, pagenation);
		pagenation.setTotal(queryResultList.getTotal());
		return new PageJsonResponse<List<${className}DTO>>(ResultUtils.SUCCESS, ResultUtils.SUCCESS_MSG, queryResultList, pagenation);
	}


	/**
	 * 
	 * @date <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
	 * @Title: find${className}DTODetail 
	 * @Description: TODO
	 * @param @param ${classNameLower}
	 * @param @param pagenation
	 * @param @param request
	 * @param @return
	 * @return JsonResponse<${className}DTO>
	 * @throws
	 */
	@RequestMapping(value="${classNameLower}s/{id}", method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE+";charset=utf-8"})
	public JsonResponse<${className}DTO> find${className}DTODetail(@PathVariable("id")Integer id, ${className}DTO ${classNameLower}, HttpServletRequest request){
		${classNameLower} = ${classNameLower}Service.get(id.toString());
		return new JsonResponse<${className}DTO>(ResultUtils.SUCCESS, ResultUtils.SUCCESS_MSG, ${classNameLower});
	}

	
	/**
	 * 
	 * @date <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
	 * @Title: modify${className}Detail 
	 * @Description: TODO
	 * @param @param id
	 * @param @param ${classNameLower}
	 * @param @param request
	 * @param @return
	 * @return JsonResponse<${className}DTO>
	 * @throws
	 */
	@RequestMapping(value="${classNameLower}s/{id}", method=RequestMethod.PATCH, produces={MediaType.APPLICATION_JSON_VALUE+";charset=utf-8"})
	public JsonResponse<${className}DTO> modify${className}Detail(@PathVariable("id")Integer id, @RequestBody ${className}DTO ${classNameLower}, HttpServletRequest request){
		${classNameLower}.setId(id);
		${classNameLower}Service.update(${classNameLower});
		return new JsonResponse<${className}DTO>(ResultUtils.SUCCESS, ResultUtils.SUCCESS_MSG, ${classNameLower}Service.get(id.toString()));
	}
	
	
	/**
	 * 
	 * @date <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
	 * @Title: add${className}DTO 
	 * @Description: TODO
	 * @param @param ${classNameLower}
	 * @param @param request
	 * @param @return
	 * @return JsonResponse<${className}DTO>
	 * @throws
	 */
	@RequestMapping(value="${classNameLower}s", method=RequestMethod.POST, produces={MediaType.APPLICATION_JSON_VALUE+";charset=utf-8"})
	public JsonResponse<${className}DTO> add${className}(@RequestBody ${className}DTO ${classNameLower}, HttpServletRequest request){
		${classNameLower}Service.insert(${classNameLower});
		return new JsonResponse<${className}DTO>(ResultUtils.SUCCESS, ResultUtils.SUCCESS_MSG, ${classNameLower}Service.get(${classNameLower}.getId().toString()));
	}
	
//	/**
//	 * 
//	 * @date <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
//	 * @Title: remove${className}DTO 
//	 * @Description: TODO
//	 * @param @param id
//	 * @param @param request
//	 * @param @return
//	 * @return JsonResponse<>
//	 * @throws
//	 */
//	@RequestMapping(value="${classNameLower}s/{id}", method=RequestMethod.DELETE, produces={MediaType.APPLICATION_JSON_VALUE+";charset=utf-8"})
//	public JsonResponse<?> remove${className}DTO(@PathVariable("id")Integer id, HttpServletRequest request){
//		${classNameLower}Service.delete(id.toString());
//		return new JsonResponse<>(ResultUtils.SUCCESS, ResultUtils.SUCCESS_MSG);
//	}
	
}
