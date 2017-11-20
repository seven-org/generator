/*
 * 文 件 名:  GeneratorMain.java
 * 创 建 人:  tangqian
 * 创建时间:  2014-4-2
 */
package com.tangqian.generator;

import cn.org.rapid_framework.generator.GeneratorFacade;

/**
 * <一句话功能简述>
 */
public class GeneratorMain {
    public static void main(String[] args) throws Exception {
        GeneratorFacade g = new GeneratorFacade();
        
//        DROP TABLE IF EXISTS t_user_mail;
//        DROP TABLE IF EXISTS t_commercial_mail;
//        DROP TABLE IF EXISTS t_manager_mail;
//        DROP TABLE IF EXISTS t_shipping_mail;
//        DROP TABLE IF EXISTS t_system_mail;
//      g.deleteOutRootDir();   //删除生成器的输出目录
        String templateDir = "/Users/se_ven/git/generator/caishigo_generator/caishigo_generator_1/generator/caishigou_generator_extension_1/template";
        g.generateByTable("t_join_family_validation", templateDir);     //通过数据库表生成文件,template为模板的根目录
//        g.generateByTable("t_commercial_mail", templateDir);
//        g.generateByTable("t_manager_mail", templateDir);
//        g.generateByTable("t_shipping_mail", templateDir);
//        g.generateByTable("t_system_mail", templateDir);
    }
}
