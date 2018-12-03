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

		String templateDir = "/mnt/sda2/home/seven/tool/git/repositories_for_seven/generator/generator/jjt_generator/template";
		// String[] tableArray =
		// "deliverer,deliverer_bank_account,deliverer_dynamic,deliverer_market,deliverer_points_detail,deliverer_wallet_detail,market,seller,seller_balance,seller_bank_account,seller_dynamic,seller_goods,seller_points_detail,seller_wallet_detail,balance_offline_order,balance_offline_order_goods".split(",");
		// String[] tableArray = "t_seller, t_seller_capital_record, t_seller_feedback,
		// t_seller_log".replaceAll(" ", "").split(",");
		// g.deleteOutRootDir(); //删除生成器的输出目录
		// for (int i=0; i<tableArray.length; i++) {
		// g.generateByTable(tableArray[i], templateDir);
		// }
		 g.generateByTable("t_user", templateDir);
		// g.generateByTable("t_city", templateDir);
		// g.generateByTable("t_validate_code", templateDir);
		// g.generateByTable("t_commission_capital_record", templateDir);
		// g.generateByTable("t_role", templateDir);
		// g.generateByTable("t_system_role", templateDir);
		// g.generateByTable("t_user_role_city_record", templateDir);
		// g.generateByTable("t_hospital_appointment", templateDir);
		// g.generateByTable("t_hospital_appointment_evaluate", templateDir);
		// g.generateByTable("t_system_variable", templateDir);
		// g.generateByTable("t_invite_statistics", templateDir);
		// g.generateByTable("t_hospital", templateDir);
		// g.generateByTable("t_user_role_city", templateDir);
		// g.generateByTable("t_hospital_category", templateDir);
		// g.generateByTable("t_hospital_appointment_record", templateDir);
		// g.generateByTable("t_withdrawals", templateDir);
		// g.generateByTable("t_invite_record", templateDir);
		// g.generateByTable("t_hospital_appointment_capital_record", templateDir);
		// g.generateByTable("t_system_menu", templateDir);

//		g.generateByTable("jjt_member", templateDir);
//		g.generateByTable("jjt_member_account", templateDir);
//		g.generateByTable("jjt_member_account_records", templateDir);
//		g.generateByTable("jjt_member_balance_withdraw", templateDir);
//		g.generateByTable("jjt_member_bank_account", templateDir);
//		g.generateByTable("jjt_member_express_address", templateDir);
//		g.generateByTable("jjt_member_favorites", templateDir);
//		g.generateByTable("jjt_member_feedback", templateDir);
//		g.generateByTable("jjt_member_gift", templateDir);
//		g.generateByTable("jjt_member_level", templateDir);
//		g.generateByTable("jjt_member_recharge", templateDir);
		
		g.generateByTable("jjt_goods", templateDir);
	}
}
