package com.lemon.cases;

import com.alibaba.fastjson.JSONPath;
import com.lemon.pojo.CaseInfo;
import com.lemon.pojo.WriteBackData;
import com.lemon.utils.*;
import org.apache.commons.lang3.StringUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 充值接口测试类型
 */
public class RechargeCase extends BaseCase {

    @Test(dataProvider = "datas")
    public void test(CaseInfo caseInfo) {
//        1、参数化替换
        paramsReplace(caseInfo);
//        2、数据库前置查询结果(数据断言必须在接口执行前后都查询)
        BigDecimal beforeSQLResult = (BigDecimal) SQLUtils.getSingleResult(caseInfo.getSql());
//        3、调用接口
        //获取鉴权头+默认头
        Map<String, String> authorizationHeader = getAuthorizationHeader();
        //调用注册接口
        String responseBody = HttpUtils.call(caseInfo, authorizationHeader);
//        4、断言响应结果  断言，期望值和实际值匹配，匹配上了就是断言成功，相反断言失败。
        boolean responseAssertFlag = responseAssert(caseInfo.getExpectedResult(), responseBody);
//        5、添加接口响应回写内容
        addWriteBackData(sheetIndex,caseInfo.getId(), Constants.RESPONSE_CELL_NUM, responseBody);
//        6、数据库后置查询结果
        BigDecimal afterSQLResult = (BigDecimal) SQLUtils.getSingleResult(caseInfo.getSql());
//        7、据库断言
        //afterSQLResult - beforeSQLResult = 参数中amount
        //使用jsonpath取出参数中amount "3331212.123123123"
        boolean sqlAssertFlag = sqlAssert(caseInfo, beforeSQLResult, afterSQLResult);
//        8、添加断言回写内容
        String assertResult = responseAssertFlag ? "PASSED" : "FAILED";
        addWriteBackData(sheetIndex,caseInfo.getId(),Constants.ASSERT_CELL_NUM, assertResult);
//        9、添加日志
//        10、报表断言
    }

    /**
     * 数据库断言
     * @param caseInfo
     * @param beforeSQLResult
     * @param afterSQLResult
     */
    public boolean sqlAssert(CaseInfo caseInfo, BigDecimal beforeSQLResult, BigDecimal afterSQLResult) {
        boolean flag = false;
        if(StringUtils.isNotBlank(caseInfo.getSql())) {
            String amountStr = JSONPath.read(caseInfo.getParams(), "$.amount").toString();
            //String => BigDecimal  "3123231.123123" - "23123.123" = 不会有数据的损失
//            BigDecimal amount = new BigDecimal("1.11");
            BigDecimal amount = new BigDecimal(amountStr);
            //afterSQLResult - beforeSQLResult
            BigDecimal subtractResult = afterSQLResult.subtract(beforeSQLResult);
            //subtractResult.compareTo(amount) == 0 说明 subtractResult == amount
            System.out.println("beforeSQLResult:" + beforeSQLResult);
            System.out.println("afterSQLResult:" + afterSQLResult);
            System.out.println("subtractResult:" + subtractResult);
            System.out.println("amount:" + amount); //1.00 = 1
            if (subtractResult.compareTo(amount) == 0) {    //-1 0 1
                System.out.println("数据库断言成功");
                flag = true;
            } else {
                System.out.println("数据库断言失败");
            }
        }
        return flag;
    }


    @DataProvider
    public Object[] datas() throws Exception {
        List<CaseInfo> list = ExcelUtils.read(sheetIndex, 1, CaseInfo.class);
        return list.toArray();
    }
}
