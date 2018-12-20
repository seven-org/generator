<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>

package ${basepackage}.dao;

import com.github.pagehelper.Page;
import ${basepackage}.domain.dto.${className}DTO;
import java.util.List;

/**
 * createTime: <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
 * @author ${author}
 * @version
 */
public interface ${className}Mapper {

	/**
	 * query by ${table.pkColumn.columnNameFirstLower}
	 * @param ${table.pkColumn.columnNameFirstLower}
	 * @return ${className}DTO
	 */
	public ${className}DTO get(String ${table.pkColumn.columnNameFirstLower} );
	
	/**
	 * query by ${table.pkColumn.columnNameFirstLower}
	 * @param ${table.pkColumn.columnNameFirstLower}
	 * @return ${className}DTO
	 */
	public ${className}DTO getForUpdate(String ${table.pkColumn.columnNameFirstLower} );

	/**
	 * query by condition
	 * @param ${classNameLower}DTO
	 * @return Integer
	 */
	public Integer getCountByCondition(${className}DTO ${classNameLower}DTO );

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
	 * query by paging
	 * @param ${classNameLower}DTO
	 * @return Page<${className}DTO>
	 */
	public Page<${className}DTO> findListByPage(${className}DTO ${classNameLower});

	/**
	 * insert
	 * @param ${classNameLower}DTO
	 * @return insert object id
	 */
	public Integer insert(${className}DTO ${classNameLower});
	
	
	/**
	 * insertMultiple
	 * @param ${classNameLower}s
	 * @return Integer
	 */
	public Integer insertMultiple(List<${className}DTO> ${classNameLower}s);


	/**
	 * update
	 * @param ${classNameLower}
	 * @return if success then != 0 else =0
	 */
	public Integer update(${className}DTO ${classNameLower});


	/**
	 * delete
	 * @param ${table.pkColumn.columnNameFirstLower}
	 * @return if success then != 0 else =0
	 */
	public Integer delete(String ${table.pkColumn.columnNameFirstLower});

}
