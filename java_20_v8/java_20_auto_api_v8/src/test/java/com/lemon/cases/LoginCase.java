package com.lemon.cases;

import com.lemon.pojo.CaseInfo;
import com.lemon.utils.Constants;
import com.lemon.utils.ExcelUtils;
import com.lemon.utils.HttpUtils;
import com.lemon.utils.UserData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class LoginCase extends BaseCase {

    @Test(dataProvider = "datas")
    public void test(CaseInfo caseInfo) {
//        1、参数化替换：真实手机号替换占位符。
        paramsReplace(caseInfo);
//        2、数据库前置查询结果(数据断言必须在接口执行前后都查询)
//        3、调用接口
        String responseBody = HttpUtils.call(caseInfo, UserData.DEFAULT_HEADERS);
        //使用jsonpath从响应体中取出token和memberId
        getParamsInUserData(responseBody,"$.data.token_info.token","${token}");
        getParamsInUserData(responseBody,"$.data.id","${member_id}");
//        4、断言响应结果  断言，期望值和实际值匹配，匹配上了就是断言成功，相反断言失败。
        boolean responseAssertFlag = responseAssert(caseInfo.getExpectedResult(), responseBody);
//        5、添加接口响应回写内容
        addWriteBackData(sheetIndex,caseInfo.getId(), Constants.RESPONSE_CELL_NUM, responseBody);
//        6、数据库后置查询结果
//        7、据库断言
//        8、添加断言回写内容
        String assertResult = responseAssertFlag ? Constants.ASSERT_SUCCESS : Constants.ASSERT_FAILED;
        addWriteBackData(sheetIndex,caseInfo.getId(),Constants.ASSERT_CELL_NUM, assertResult);
//        9、添加日志
//        10、报表断言
        Assert.assertEquals(assertResult,Constants.ASSERT_SUCCESS);


    }




    @DataProvider
    public Object[] datas() throws Exception {
        List<CaseInfo> list = ExcelUtils.read(sheetIndex, 1, CaseInfo.class);
        return list.toArray();
    }
}
