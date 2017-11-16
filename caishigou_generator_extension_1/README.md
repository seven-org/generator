# rapid-generator-3.9.2
自动代码生成工具[利用freemarker模板生成]

1.本生成工具适合单表
2.工具生成前置条件:
    2.1 数据库建表规则
        (1)建表必须有主键,如果有复合主键,注意查看生成后的代码做适当调整
        (2)建表必有字段：delete_flag(0未删除1删除),create_user,create_date,update_user,update_date
        (3)数据表注释及字段注释,作为页面字段的展示        