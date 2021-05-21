<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>

package ${basepackage}.service;

import org.springframework.beans.BeanUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Date;

import ${basepackage}.dao.${className}Repository;
import ${basepackage}.service.${className}Service;

/**
 * createTime: <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
 * @author ${author}
 * @version
 */
@Service
@Slf4j
public class ${className}ServiceImpl implements ${className}Service {

    @Autowired
    private ${className}Repository ${classNameLower}Repository;

}
