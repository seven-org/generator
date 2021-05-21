<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>

package ${basepackage}.component.dto;

import java.io.Serializable;

import ${basepackage}.entity.${className};

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * createTime: <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
 * @author ${author}
 * @version
 */
@Data
@ToString(callSuper=true, includeFieldNames=true)
@SuperBuilder
@NoArgsConstructor
public class ${className}DTO extends ${className} implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
}