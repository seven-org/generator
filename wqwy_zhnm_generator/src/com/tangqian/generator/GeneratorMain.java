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
        String[] tableArray = "deliverer,deliverer_bank_account,deliverer_dynamic,deliverer_market,deliverer_points_detail,deliverer_wallet_detail,market,seller,seller_balance,seller_bank_account,seller_dynamic,seller_goods,seller_points_detail,seller_wallet_detail,balance_offline_order,balance_offline_order_goods".split(",");
//      g.deleteOutRootDir();   //删除生成器的输出目录
//        for (int i=0; i<tableArray.length; i++) {
//        	g.generateByTable(tableArray[i], templateDir);
//        }
        g.generateByTable("balance_offline_order_goods", templateDir);
      
    }
}
