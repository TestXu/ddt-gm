package com.tsixi.ddt2.test.pages.pageselement;

import com.tsixi.ddt2.test.base.ExcelData;
import com.tsixi.ddt2.test.utils.XMLHelp;

import java.util.Map;

/**
 * DDT2-GM发奖页面元素
 *
 * @Author taoxu
 * @Date 2017/3/13 16:23
 */
public final class RewardPage {
    public final static Map<String, String[]> rewardPageEles = new XMLHelp("elementdata/RewardEleData.xml").getele();
    public final static String[] ZONE_BUTTON = rewardPageEles.get("zone_button");//赛区下拉框

    public  static String[] TEST_SERVER = new String[2];//五服测试服

    public final static String[] ROLE_INPUT = rewardPageEles.get("role_input");//角色输入框

    public final static String[] ROLE_BUTTONN = rewardPageEles.get("role_buttonn");//角色下拉框

    public final static String[] AROLE = rewardPageEles.get("arole");//在线角色选项

    public final static String[] REASON_BUTTON = rewardPageEles.get("reason_button");//发奖原因下拉框

    public final static String[] REASON_WEI = rewardPageEles.get("reason_wei");//系统维护选项

    public final static String[] INSTRUCTIONS = rewardPageEles.get("instructions");//详细说明输入框

    public final static String[] ADDITEMS = rewardPageEles.get("additems");//添加物品按钮

    public final static String[] PROP_INPUT = rewardPageEles.get("prop_input");//道具搜索框

    public final static String[] FIRST_PROP = rewardPageEles.get("first_prop");//第一条道具选项

    public final static String[] PROP_NUM = rewardPageEles.get("prop_num");//物品数量

    public final static String[] ACCEPT = rewardPageEles.get("accept");//确定按钮

    public final static String[] PERFORM = rewardPageEles.get("perform");//执行操作按钮

    public final static String[] ACCEPT_PERFORM = rewardPageEles.get("accept_perform");//确定执行按钮

    public static String[] getTestServer() {
        return TEST_SERVER;
    }

    public static void setTestServer(String[] testServer) {
        TEST_SERVER = testServer;
    }

    public  void  ServerType(){
        String[] test_servers = new String[2];
        String test_server = rewardPageEles.get("test_server")[1]+ ExcelData.getInServerType()+"']";
        test_servers[0]=rewardPageEles.get("test_server")[0];
        test_servers[1] = test_server;
        setTestServer(test_servers);
    }
}

