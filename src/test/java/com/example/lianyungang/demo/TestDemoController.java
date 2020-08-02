package com.example.lianyungang.demo;

import com.example.lianyungang.common.DateTimeUtil;
import com.example.lianyungang.common.ExcelUtil;
import com.example.lianyungang.common.WordUtil;
import com.example.lianyungang.entity.Doc;
import org.junit.jupiter.api.Test;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class TestDemoController {
    @Test
    public void testTime() throws Exception {
        String s = "22-三月-2020";
        String lastString = "";
        if(s.contains("月")){
            String[] split = s.split("-");
            String s1 = DateTimeUtil.dateTransform(split[1]);
            split[1]=s1;

            for(String x : split){
                lastString = lastString.concat(x);
            }
            System.out.println(lastString);
        }





        Date date = DateTimeUtil.strToDate(lastString,"ddMMyyyy");
        System.out.println();
    }

    @Test
    public void testCreateDoc2(){

        // 设定Excel文件所在路径
        String excelFileName = "G:\\projects\\kafka_source_code_study\\lianyungang\\src\\main\\resources\\templates\\wangdong.xlsx";
        // 读取Excel文件内容
        List<Doc> readResult = ExcelUtil.readExcel(excelFileName);
        System.out.println(readResult.get(0));
        //填充数据

        Doc wordout=readResult.get(0);

        String filePath = "G:\\projects\\kafka_source_code_study\\lianyungang\\src\\main\\resources\\out" ;
        String outFileName = "test.doc";

        WordUtil.createWord(wordout, "wangdong.xml", filePath, outFileName);

    }


}
