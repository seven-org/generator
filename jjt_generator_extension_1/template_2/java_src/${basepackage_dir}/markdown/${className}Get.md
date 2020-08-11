<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameFirstLower = table.classNameFirstLower>   
    
**简要描述：** 

- 获取${className}列表接口
- ${table.remarks}对象

**请求URL：** 
- ` /{version}/${classNameFirstLower}s `
  
**请求方式：**
- GET 

**参数：** 

|参数名|必选|类型|说明|
|:----    |:---|:----- |-----   |
<#list table.columns as column>
|${column.columnNameLower}     |否  |${column.simpleJavaType} | ${column.remarks}    |
</#list>

 **返回示例**

``` 
  {
  	"code": 200,
  	"message": "成功",
    	"data": [{
      	<#list table.columns as column>
      	"${column.columnNameLower}": ,
      	</#list>
    	},
    	...
    	]
  }
```

 **返回参数说明** 

|参数名|类型|说明|
|:----  |:----- |-----   |
<#list table.columns as column>
|${column.columnNameLower}  |${column.simpleJavaType} | ${column.remarks}    |
</#list>

 **备注** 

- 更多返回错误代码请看首页的错误代码描述
