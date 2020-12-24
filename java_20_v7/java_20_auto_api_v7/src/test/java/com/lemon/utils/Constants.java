package com.lemon.utils;

public class Constants {
    //final修饰变量，变量成为常量，常量只能赋值一次。
    //响应数据回写列号
    public static final int RESPONSE_CELL_NUM = 8;
    //断言回写列号
    public static final int ASSERT_CELL_NUM = 10;
    //用例文件地址
    public static final String EXCEL_PATH = "src/test/resources/cases_v3.xlsx";

    public static final String JDBC_URL ="jdbc:mysql://api.lemonban.com:3306/futureloan?useUnicode=true&characterEncoding=utf-8";
    public static final String JDBC_USERNAME ="future";
    public static final String JDBC_PASSOWRD ="123456";

}
