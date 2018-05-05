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
        String templateDir = "/home/seven/tool/git/repositories_for_seven/generator/generator/caishigou_generator_extension_1/template";
//        g.generateByTable("t_capital", templateDir);     //通过数据库表生成文件,template为模板的根目录
//        g.generateByAllTable(templateDir);
        g.generateByTable("t_gift_card_sent_person", templateDir);
//        g.generateByTable("t_group_purchase_goods_condition_template", templateDir);
//        g.generateByTable("t_group_purchase", templateDir);
//        g.generateByTable("t_group_purchase_user", templateDir);
//        g.generateByTable("t_group_purchase_order", templateDir);
//        g.generateByTable("t_group_purchase_order_goods", templateDir);
//        g.generateByTable("t_commercial_mail", templateDir);
//        g.generateByTable("t_manager_mail", templateDir);
//        g.generateByTable("t_shipping_mail", templateDir);
//        g.generateByTable("t_system_mail", templateDir);
    }
}
