<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>

package ${basepackage}.domain.dto;

import java.io.Serializable;

import ${basepackage}.domain.entity.${className};

/**
 * createTime: <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
 * @author ${author}
 * @version
 */
public class ${className}DTO extends ${className} implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
}