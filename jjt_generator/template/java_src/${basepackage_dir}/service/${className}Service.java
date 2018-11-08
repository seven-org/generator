<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>

package ${basepackage}.service;

import com.github.pagehelper.Page;
import com.jjt.store.component.base.Pagenation;
import ${basepackage}.domain.dto.MemberDTO;

import java.util.List;

/**
 * createTime: <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
 * @author ${author}
 * @version
 */
public interface ${className}Service {

	/**
	 * query
	 * @param ${table.pkColumn.columnNameFirstLower}
	 * @return ${className}
	 */
	public ${className}DTO get(Integer ${table.pkColumn.columnNameFirstLower});

	/**
	 * query by condition
	 * @param ${classNameLower}
	 * @return Integer
	 */
	public Integer getCountByCondition(${className}DTO ${classNameLower} );
	
	/**
	 * query by condition
	 * @param ${classNameLower}
	 * @return ${className}
	 */
	public ${className}DTO findOne(${className}DTO ${classNameLower}DTO);
	
	/**
	 * query
	 * @param ${classNameLower}
	 * @return List<${className}>
	 */
	public List<${className}DTO> findList(${className}DTO ${classNameLower}DTO);

	/**
	 * query
	 * @param ${classNameLower}
	 * @return Page<${className}>
	 */
	public Page<${className}DTO> findListByPage(${className}DTO ${classNameLower}DTO, Pagenation pagenation);

	/**
	 * insert
	 * @param ${classNameLower}
	 * @return
	 */
	public Integer insert(${className}DTO ${classNameLower}DTO);


	/**
	 * update
	 * @param ${classNameLower}
	 * @return
	 */
	public Integer update(${className}DTO ${classNameLower}DTO);


	/**
	 * delete
	 * @param ${table.pkColumn.columnNameFirstLower}
	 * @return
	 */
	public Integer delete(Integer ${table.pkColumn.columnNameFirstLower});



}
