<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>

package ${basepackage}.dao;

import java.util.List;

import com.github.pagehelper.Page;
import ${basepackage}.domain.dto.${className}DTO;

/**
 * createTime: <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
 * @author ${author}
 * @version
 */
public interface ${className}Mapper {

	/**
	 * query by ${table.pkColumn.columnNameFirstLower}
	 * @param ${table.pkColumn.columnNameFirstLower}
	 * @return ${className}
	 */
	public ${className}DTO get(Integer ${table.pkColumn.columnNameFirstLower} );
	
	/**
	 * query by condition
	 * @param ${classNameLower}
	 * @return Integer
	 */
	public Integer getCountByCondition(${className}DTO ${classNameLower}DTO );

	/**
	 * query by condition
	 * @param ${classNameLower}
	 * @return ${className}
	 */
	public ${className}DTO findOne(${className}DTO ${classNameLower}DTO);
	
	/**
	 * query by condition
	 * @param ${classNameLower}
	 * @return List<${className}>
	 */
	public List<${className}DTO> findList(${className}DTO ${classNameLower}DTO);

	/**
	 * query by paging
	 * @param ${classNameLower}
	 * @return Page<${className}>
	 */
	public Page<${className}DTO> findListByPage(${className}DTO ${classNameLower}DTO);

	/**
	 * insert
	 * @param ${classNameLower}
	 * @return if success then != 0 else =0
	 */
	public Integer insert(${className}DTO ${classNameLower}DTO);


	/**
	 * update
	 * @param ${classNameLower}
	 * @return if success then != 0 else =0
	 */
	public Integer update(${className}DTO ${classNameLower}DTO);


	/**
	 * delete
	 * @param ${table.pkColumn.columnNameFirstLower}
	 * @return if success then != 0 else =0
	 */
	public Integer delete(Integer ${table.pkColumn.columnNameFirstLower});

}
