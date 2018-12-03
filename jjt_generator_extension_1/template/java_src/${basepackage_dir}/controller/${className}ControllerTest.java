<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>

package ${basepackage}.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import ${basepackage}.base.component.constant.DefaultConstants;
import ${basepackage}.base.component.utils.JsonUtils;
import ${basepackage}.constants.TestConsts;
import ${basepackage}.base.dto.${className}DTO;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.servlet.http.HttpServletRequest;

/**
 * createTime: <#if now??>${now?string('yyyy-MM-dd HH:mm:ss')}</#if>
 * @author ${author}
 * @version
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@Rollback(value=true)
@Transactional
public class ${className}ControllerTest {

	@Autowired
    private MockMvc mockMvc;
    
    @Before
    public void setUp() throws Exception {
    	
    }
    
    @After
    public void tearDown() throws Exception {
    	
    }
    
    /**
     * findByPage
     */
    @Test
    public void testGet${className}s() throws Exception {
        mockMvc.perform(get("/${version}/${classNameLower}s").header(DefaultConstants.TOKEN, TestConsts.TokenValue))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
        .andReturn().getResponse().getContentAsString();
    }
    
    /**
     * post
     */
    @Test
    public void testPost${className}s() throws Exception {
    	${className}DTO ${classNameLower} = new ${className}DTO();
    	System.out.println(JsonUtils.AsJsonString(${classNameLower}));
        mockMvc.perform(post("/${version}/${classNameLower}s")
        		.header(DefaultConstants.TOKEN, TestConsts.TokenValue)
        		.contentType(MediaType.APPLICATION_JSON)
        		.content(JsonUtils.AsJsonString(${classNameLower})))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
        .andReturn().getResponse().getContentAsString();
    }
    
    /**
     * patch
     */
    @Test
    public void testPatch${className}s() throws Exception {
    	${className}DTO ${classNameLower} = new ${className}DTO();
    	System.out.println(JsonUtils.AsJsonString(${classNameLower}));
        mockMvc.perform(patch("/${version}/${classNameLower}s")
        		.header(DefaultConstants.TOKEN, TestConsts.TokenValue)
        		.contentType(MediaType.APPLICATION_JSON)
        		.content(JsonUtils.AsJsonString(${classNameLower})))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
        .andReturn().getResponse().getContentAsString();
    }
    
    /**
     * delete
     */
    @Test
    public void testDelete${className}s() throws Exception {
        mockMvc.perform(delete("/${version}/${classNameLower}s")
        		.header(DefaultConstants.TOKEN, TestConsts.TokenValue))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
        .andReturn().getResponse().getContentAsString();
    }
    
    /**
     * find${className}Detail 
     */
    @Test
    public void testGetOne${className}Detail() throws Exception {
        mockMvc.perform(get("/${version}/${classNameLower}s/1").header(DefaultConstants.TOKEN, TestConsts.TokenValue))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
        .andReturn().getResponse().getContentAsString();
    }
    
}
