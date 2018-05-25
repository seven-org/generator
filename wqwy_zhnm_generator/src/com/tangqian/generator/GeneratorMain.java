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
        
        String templateDir = "/home/seven/tool/git/repositories_for_seven/generator/generator/wqwy_zhnm_generator/template";
//        String[] tableArray = "deliverer,deliverer_bank_account,deliverer_dynamic,deliverer_market,deliverer_points_detail,deliverer_wallet_detail,market,seller,seller_balance,seller_bank_account,seller_dynamic,seller_goods,seller_points_detail,seller_wallet_detail,balance_offline_order,balance_offline_order_goods".split(",");
        String[] tableArray = "shop_address, shop_attribute, shop_attribute_detail, shop_banner, shop_cart, shop_category, shop_collection, shop_comment, shop_contact, shop_coupon, shop_express, shop_expressconfig, shop_freight, shop_goods, shop_grade, shop_information, shop_navigation, shop_news, shop_notice, shop_order, shop_order_detail, shop_qiyu, shop_record, shop_refund, shop_search, shop_user, shop_usercoupon, sys_app_user, sys_dictionaries, sys_fhbutton, sys_fhsms, sys_menu, sys_menu_copy, sys_role, sys_role_fhbutton, sys_user, weixin_accesstoken, weixin_button, weixin_command, weixin_config, weixin_imgmsg, weixin_reply, weixin_textmsg".replaceAll(" ", "").split(",");
//      g.deleteOutRootDir();   //删除生成器的输出目录
//        for (int i=0; i<tableArray.length; i++) {
//        	g.generateByTable(tableArray[i], templateDir);
//        }
        g.generateByTable("validate_code", templateDir);
      
    }
}
