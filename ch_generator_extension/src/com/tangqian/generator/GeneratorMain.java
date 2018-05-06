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
        String templateDir = "/Users/se_ven/git/generator/generator/ch_generator_extension/template";
//      g.generateByAllTable(templateDir);		//generate all tables 
//        g.generateByTable("jc_filter", templateDir);     //通过数据库表生成文件,template为模板的根目录
        
//        String[] tableArray = "jc_filter,jc_friendlink,jc_house,jc_house_discount,jc_house_favorite,jc_house_filter,jc_house_live,jc_news,jc_area,jc_banner,jc_category,jc_config,jc_order,jc_owner,jc_page,jc_sms,jc_user,jc_user_contact,jc_user_group,jc_user_rule,jc_user_score_log".split(",");
        String[] tableArray = "jc_friendlink,jc_house,jc_house_discount,jc_house_favorite,jc_house_filter,jc_house_live,jc_news,jc_area,jc_banner,jc_category,jc_config,jc_order,jc_owner,jc_page,jc_sms,jc_user_contact,jc_user_group,jc_user_rule,jc_user_score_log".split(",");
        
        for (int i=0; i<tableArray.length; i++) {
        	g.generateByTable(tableArray[i], templateDir);
        }
        
//        g.generateByTable("t_group_purchase_order_goods", templateDir);
//        g.generateByTable("t_commercial_mail", templateDir);
//        g.generateByTable("t_manager_mail", templateDir);
//        g.generateByTable("t_shipping_mail", templateDir);
//        g.generateByTable("t_system_mail", templateDir);
    }
}
