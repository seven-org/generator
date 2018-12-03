<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>

package ${basepackage}.base.dto;

import java.io.Serializable;

import ${basepackage}.base.model.${className};

/**
 * createTime: <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
 * @author ${author}
 * @version
 */
public class ${className}DTO extends ${className} implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
}