<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.base.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import ${basepackage}.base.dao.${className}Mapper;
import ${basepackage}.base.entity.${className};
import ${basepackage}.base.component.component.Pagenation;
import ${basepackage}.base.service.${className}Service;

/**
 * createTime: <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
 * @author ${author}
 * @version
 */
@Service
public class ${className}ServiceImpl implements ${className}Service {

    @Autowired
    private ${className}Mapper ${classNameLower}Mapper;

    private static final Logger logger = LoggerFactory.getLogger(${className}ServiceImpl.class);

    @Override
    public ${className} get(String ${table.pkColumn.columnNameFirstLower}) {
        return ${classNameLower}Mapper.get(${table.pkColumn.columnNameFirstLower});
    }

    @Override
	public Integer getCountByCondition(${className} ${classNameLower} ) {
    	return ${classNameLower}Mapper.getCountByCondition(${classNameLower});
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

    @Override
    public Integer update(${className} ${classNameLower}) {
        ${classNameLower}.setUpdateTime(new Date());
        return ${classNameLower}Mapper.update(${classNameLower});
    }

    @Override
    public Integer delete(String ${table.pkColumn.columnNameFirstLower}) {
        return ${classNameLower}Mapper.delete(${table.pkColumn.columnNameFirstLower});
    }
}
