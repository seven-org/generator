<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.service;

import com.github.pagehelper.Page;
import ${basepackage}.model.Pagenation;

import ${basepackage}.model.${className};

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
	public ${className} get(String ${table.pkColumn.columnNameFirstLower});

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
	 * query
	 * @param ${classNameLower}
	 * @return Page<${className}>
	 */
	public Page<${className}> findListByPage(${className} ${classNameLower}, Pagenation pagenation);

	/**
	 * insert
	 * @param ${classNameLower}
	 * @return
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
	 * @return
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
	 * @return
	 */
	public Integer delete(String ${table.pkColumn.columnNameFirstLower});



}
