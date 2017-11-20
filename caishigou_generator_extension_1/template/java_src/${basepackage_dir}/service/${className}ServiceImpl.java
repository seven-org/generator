<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.service;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Date;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import ${basepackage}.mapper.${className}Mapper;
import ${basepackage}.model.${className};
import ${basepackage}.model.Pagenation;
import ${basepackage}.service.${className}Service;

/**
 * createTime: <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
 * @author ${author}
 * @version
 */
@Service
public class ${className}ServiceImpl implements ${className}Service {

    @Autowired
    private ${className}Mapper ${classNameLower}Mapper;

    private static Logger logger = Logger.getLogger(${className}ServiceImpl.class);

    @Override
    public ${className} get(String ${table.pkColumn.columnNameFirstLower}) {
        return ${classNameLower}Mapper.get(${table.pkColumn.columnNameFirstLower});
    }

    @Override
    public List<${className}> findList(${className} ${classNameLower}) {
        return ${classNameLower}Mapper.findList(${classNameLower});
    }

    @Override
    public Page<${className}> findListByPage(${className} ${classNameLower}, Pagenation pagenation) {
        PageHelper.startPage(pagenation.getPageNum(), pagenation.getPageSize());
        return ${classNameLower}Mapper.findListByPage(${classNameLower});
    }

    @Override
    public Integer insert(${className} ${classNameLower}) {
        ${classNameLower}.setCreateTime(new Date());
        return ${classNameLower}Mapper.insert(${classNameLower});
    }

	public Integer insertMultiple(List<${className}> ${classNameLower}s) {
		//createTime
		return ${classNameLower}Mapper.insertMultiple(${classNameLower}s);
	}
	
    @Override
    public Integer update(${className} ${classNameLower}) {
        ${classNameLower}.setUpdateTime(new Date());
        return ${classNameLower}Mapper.update(${classNameLower});
    }
    
    @Override
    public Integer updateMultiple(List<${className}> ${classNameLower}s) {
    	//updateTime
        return ${classNameLower}Mapper.updateMultiple(${classNameLower}s);
    }

    @Override
    public Integer delete(String ${table.pkColumn.columnNameFirstLower}) {
        return ${classNameLower}Mapper.delete(${table.pkColumn.columnNameFirstLower});
    }
}
