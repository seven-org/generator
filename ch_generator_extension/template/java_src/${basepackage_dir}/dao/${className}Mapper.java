<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>

package ${basepackage}.dao;

import com.github.pagehelper.Page;
import ${basepackage}.entity.${className};
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
	 * @return ${className}
	 */
	public ${className} get(String ${table.pkColumn.columnNameFirstLower} );

	/**
	 * query list
	 * @param ${classNameLower}
	 * @return List<${className}>
	 */
	public List<${className}> findList(${className} ${classNameLower});
	
	/**
	 * query list count
	 * @param ${classNameLower}
	 * @return List<${className}>
	 */
	public Integer findListCount(${className} ${classNameLower});

	/**
	 * query by paging
	 * @param ${classNameLower}
	 * @return Page<${className}>
	 */
	public Page<${className}> findListByPage(${className} ${classNameLower});

	/**
	 * insert
	 * @param ${classNameLower}
	 * @return if success then != 0 else =0
	 */
	public Integer insert(${className} ${classNameLower});
	
	
	/**
	 * insertMultiple
	 * @param ${classNameLower}s
	 * @return Integer
	 */
	public Integer insertMultiple(List<${className}> ${classNameLower}s);


	/**
	 * update
	 * @param ${classNameLower}
	 * @return if success then != 0 else =0
	 */
	public Integer update(${className} ${classNameLower});
	
	
	/**
	 * Multiple
	 * @param ${classNameLower}s
	 * @return if success then != 0 else =0
	 */
	public Integer updateMultiple(List<${className}> ${classNameLower}s);


	/**
	 * delete
	 * @param ${table.pkColumn.columnNameFirstLower}
	 * @return if success then != 0 else =0
	 */
	public Integer delete(String ${table.pkColumn.columnNameFirstLower});

}
