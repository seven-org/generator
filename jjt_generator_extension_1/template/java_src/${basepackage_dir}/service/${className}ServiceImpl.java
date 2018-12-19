<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.base.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Date;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import ${basepackage}.base.dao.${className}Mapper;
import ${basepackage}.base.dto.${className}DTO;
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
    public ${className}DTO get(String ${table.pkColumn.columnNameFirstLower}) {
        return ${classNameLower}Mapper.get(${table.pkColumn.columnNameFirstLower});
    }

    @Override
   	public Integer getCountByCondition(${className}DTO ${classNameLower} ) {
       	return ${classNameLower}Mapper.getCountByCondition(${classNameLower});
   	}
   	
	@Override
	public ${className}DTO findOne(${className}DTO ${classNameLower}) {
		return ${classNameLower}Mapper.findOne(${classNameLower});
	}
	
	@Override
	public ${className}DTO findOneForUpdate(${className}DTO ${classNameLower}) {
		return ${classNameLower}Mapper.findOne(${classNameLower});
	}
   
    @Override
    public List<${className}DTO> findList(${className}DTO ${classNameLower}) {
        return ${classNameLower}Mapper.findList(${classNameLower});
    }
    
    @Override
    public Page<${className}DTO> findListByPage(${className}DTO ${classNameLower}, Pagenation pagenation) {
        PageHelper.startPage(pagenation.getPageNum(), pagenation.getPageSize());
        return ${classNameLower}Mapper.findListByPage(${classNameLower});
    }

    @Override
    public Integer insert(${className}DTO ${classNameLower}) {
        ${classNameLower}.setCreateTime(new Date());
        return ${classNameLower}Mapper.insert(${classNameLower});
    }

	public Integer insertMultiple(List<${className}DTO> ${classNameLower}s) {
		//createTime
		if (${classNameLower}s == null || ${classNameLower}s.isEmpty())
			return DefaultConstants.ZERO_INTEGER;
		${classNameLower}s.forEach(t -> {
    		t.setCreateTime(new Date());
    	});
		return ${classNameLower}Mapper.insertMultiple(${classNameLower}s);
	}
	
    @Override
    public Integer update(${className}DTO ${classNameLower}) {
        ${classNameLower}.setUpdateTime(new Date());
        return ${classNameLower}Mapper.update(${classNameLower});
    }
    
    @Override
    public Integer updateMultiple(List<${className}DTO> ${classNameLower}s) {
    	//updateTime
    	if (${classNameLower}s == null || ${classNameLower}s.isEmpty())
			return DefaultConstants.ZERO_INTEGER;
    	${classNameLower}s.forEach(t -> {
    		t.setUpdateTime(new Date());
    		this.update(t);
    	});
        return null;
    }

    @Override
    public Integer delete(String ${table.pkColumn.columnNameFirstLower}) {
        return ${classNameLower}Mapper.delete(${table.pkColumn.columnNameFirstLower});
    }
}
