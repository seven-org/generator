<#include "/macro.include"/>
<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>

package ${basepackage}.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * createTime: <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
 * @author ${author}
 * @version
 */
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="${className} ${table.remarks}", description="${table.remarks} 对象")
public class ${className}{

    <#list table.columns as column>
    /**
     * ${column.remarks}
     */
    <#if column.simpleJavaType == 'java.util.Date' >
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    </#if>
    @ApiModelProperty(value="${column.remarks}", name="${column.columnNameFirstLower}")
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