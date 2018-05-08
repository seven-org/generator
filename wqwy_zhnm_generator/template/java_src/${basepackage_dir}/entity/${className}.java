<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.base.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * createTime: <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
 * @author ${author}
 * @version
 */
public class ${className}{

    <#list table.columns as column>
    /**
     * ${column.remarks}
     */
    <#if column.simpleJavaType == 'java.util.Date' >
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    </#if>
    private ${column.simpleJavaType} ${column.columnNameFirstLower};

    </#list>

    <@generateJavaColumns/>
}
    <#macro generateJavaColumns>
        <#list table.columns as column>
    public void set${column.columnName}(${column.simpleJavaType} value){
        this.${column.columnNameFirstLower} = value;
    }

    public ${column.simpleJavaType} get${column.columnName}(){
        return this.${column.columnNameFirstLower};
    }

        </#list>
    </#macro>