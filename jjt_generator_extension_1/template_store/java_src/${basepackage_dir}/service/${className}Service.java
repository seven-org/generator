<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>

package ${basepackage}.service;

import com.github.pagehelper.Page;
import com.jjt.store.component.base.Pagenation;

import ${basepackage}.domain.dto.${className}DTO;

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
	 * @return ${className}DTO
	 */
	public ${className}DTO get(String ${table.pkColumn.columnNameFirstLower});

	/**
	 * query by condition
	 * @param ${classNameLower}DTO
	 * @return Integer
	 */
	public Integer getCountByCondition(${className}DTO ${classNameLower} );
	
	/**
	 * query by condition
	 * @param ${classNameLower}DTO
	 * @return ${className}DTO
	 */
	public ${className}DTO findOne(${className}DTO ${classNameLower}DTO);
	
	/**
	 * query by condition
	 * @param ${classNameLower}DTO
	 * @return ${className}DTO
	 */
	public ${className}DTO findOneForUpdate(${className}DTO ${classNameLower}DTO);

	/**
	 * query list
	 * @param ${classNameLower}DTO
	 * @return List<${className}DTO>
	 */
	public List<${className}DTO> findList(${className}DTO ${classNameLower});

	/**
	 * query
	 * @param ${classNameLower}DTO
	 * @return Page<${className}DTO>
	 */
	public Page<${className}DTO> findListByPage(${className}DTO ${classNameLower}, Pagenation pagenation);
	
	/**
	 * query
	 * @param ${classNameLower}DTO
	 * @return Page<${className}DTO>
	 */
	public Page<${className}DTO> findListByPageForSearch(${className}DTO ${classNameLower}, Pagenation pagenation);

	/**
	 * insert
	 * @param ${classNameLower}DTO
	 * @return
	 */
	public Integer insert(${className}DTO ${classNameLower});
	
	
	/**
	 * insertMultiple
	 * @param ${classNameLower}DTO
	 * @return Integer
	 */
	public Integer insertMultiple(List<${className}DTO> ${classNameLower}s);


	/**
	 * update
	 * @param ${classNameLower}DTO
	 * @return
	 */
	public Integer update(${className}DTO ${classNameLower});
	
	
	/**
	 * Multiple
	 * @param ${classNameLower}DTO
	 * @return if success then != 0 else =0
	 */
	public Integer updateMultiple(List<${className}DTO> ${classNameLower}s);


	/**
	 * delete
	 * @param ${table.pkColumn.columnNameFirstLower}
	 * @return
	 */
	public Integer delete(String ${table.pkColumn.columnNameFirstLower});



}
