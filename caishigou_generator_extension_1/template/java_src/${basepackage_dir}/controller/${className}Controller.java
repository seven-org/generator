<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>

package ${basepackage}.controller;

import com.github.pagehelper.Page;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import oracle.net.ano.Service;
import ${basepackage}.dto.OperateResult;
import ${basepackage}.model.${className};
import ${basepackage}.service.${className}Service;
import ${basepackage}.model.JsonResponse;
import ${basepackage}.model.Pagenation;
import ${basepackage}.util.ResultUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * createTime: <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
 * @author ${author}
 * @version
 */
@RestController
@RequestMapping("/${version}/${classNameLower}/")
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
	public PageJsonResponse<List<${className}>> findByPage(${className} ${classNameLower}, Pagenation pagenation, HttpServletRequest request, Model model) {
		Page<${className}> queryResultList = ${classNameLower}Service.findListByPage(${classNameLower}, pagenation);
		pagenation.setTotal(queryResultList.getTotal());
		return new PageJsonResponse<List<${className}>>(ResultUtils.success, ResultUtils.successMsg, queryResultList, pagenation);
	}


	/**
	 * 
	 * @date <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
	 * @Title: find${className}Detail 
	 * @Description: TODO
	 * @param @param ${classNameLower}
	 * @param @param pagenation
	 * @param @param request
	 * @param @return
	 * @return JsonResponse<${className}>
	 * @throws
	 */
	@RequestMapping(value="${classNameLower}s/{id}", method=RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE+";charset=utf-8"})
	public JsonResponse<${className}> find${className}Detail(@PathVariable("id")Integer id, ${className} ${classNameLower}, HttpServletRequest request){
		${classNameLower} = ${classNameLower}Service.get(id.toString());
		return new JsonResponse<${className}>(ResultUtils.success, ResultUtils.successMsg, ${classNameLower});
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
	 * @return JsonResponse<${className}>
	 * @throws
	 */
	@RequestMapping(value="${classNameLower}s/{id}", method=RequestMethod.PATCH, produces={MediaType.APPLICATION_JSON_VALUE+";charset=utf-8"})
	public JsonResponse<${className}> modify${className}Detail(@PathVariable("id")Integer id, @RequestBody ${className} ${classNameLower}, HttpServletRequest request){
		${classNameLower}.setId(id.toString());
		${classNameLower}Service.update(${classNameLower});
		return new JsonResponse<${className}>(ResultUtils.success, ResultUtils.successMsg, ${classNameLower}Service.get(id.toString()));
	}
	
	
	/**
	 * 
	 * @date <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
	 * @Title: updateMultiple${className} 
	 * @Description: TODO
	 * @param @param ${classNameLower}List
	 * @param @param request
	 * @param @return
	 * @return JsonResponse<>
	 * @throws
	 */
	@RequestMapping(value="${classNameLower}List", method=RequestMethod.PATCH, produces={MediaType.APPLICATION_JSON_VALUE+";charset=utf-8"})
	public JsonResponse<?> modifyMultiple${className}Detail(@RequestBody List<${className}> ${classNameLower}List, HttpServletRequest request){
		${classNameLower}Service.updateMultiple(${classNameLower}List);
		return new JsonResponse<>(ResultUtils.success, ResultUtils.successMsg);
	}
	
	
	/**
	 * 
	 * @date <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
	 * @Title: add${className} 
	 * @Description: TODO
	 * @param @param ${classNameLower}
	 * @param @param request
	 * @param @return
	 * @return JsonResponse<${className}>
	 * @throws
	 */
	@RequestMapping(value="${classNameLower}s", method=RequestMethod.POST, produces={MediaType.APPLICATION_JSON_VALUE+";charset=utf-8"})
	public JsonResponse<${className}> add${className}(@RequestBody ${className} ${classNameLower}, HttpServletRequest request){
		${classNameLower}Service.insert(${classNameLower});
		return new JsonResponse<${className}>(ResultUtils.success, ResultUtils.successMsg, ${classNameLower}Service.findList(${classNameLower}).get(0));
	}
	
	
	/**
	 * 
	 * @date <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
	 * @Title: addMultiple${className} 
	 * @Description: TODO
	 * @param @param ${classNameLower}List
	 * @param @param request
	 * @param @return
	 * @return JsonResponse<>
	 * @throws
	 */
	@RequestMapping(value="${classNameLower}List", method=RequestMethod.POST, produces={MediaType.APPLICATION_JSON_VALUE+";charset=utf-8"})
	public JsonResponse<?> addMultiple${className}(@RequestBody List<${className}> ${classNameLower}List, HttpServletRequest request){
		${classNameLower}Service.insertMultiple(${classNameLower}List);
		return new JsonResponse<>(ResultUtils.success, ResultUtils.successMsg);
	}
	
	
	/**
	 * 
	 * @date <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
	 * @Title: remove${className} 
	 * @Description: TODO
	 * @param @param id
	 * @param @param request
	 * @param @return
	 * @return JsonResponse<>
	 * @throws
	 */
	@RequestMapping(value="${classNameLower}s/{id}", method=RequestMethod.DELETE, produces={MediaType.APPLICATION_JSON_VALUE+";charset=utf-8"})
	public JsonResponse<?> remove${className}(@PathVariable("id")Integer id, HttpServletRequest request){
		${classNameLower}Service.delete(id.toString());
		return new JsonResponse<>(ResultUtils.success, ResultUtils.successMsg);
	}
	
}
