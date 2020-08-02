package com.example.lianyungang.controller;

import com.example.lianyungang.common.ExcelUtil;
import com.example.lianyungang.common.WordUtil;
import com.example.lianyungang.entity.Doc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DemoController {

    @RequestMapping(value = "/word")
    @ResponseBody
    public void generateWordDocFromExcel(){
        // 设定Excel文件所在路径
        String excelFileName = "G:\\projects\\kafka_source_code_study\\lianyungang\\src\\main\\resources\\templates\\wangdong.xlsx";
        // 读取Excel文件内容
        List<Doc> readResult = ExcelUtil.readExcel(excelFileName);
        //填充数据到word.
        String filePath = "G:\\projects\\kafka_source_code_study\\lianyungang\\src\\main\\resources\\out" ;
        for (int i = 0; i <4 ; i++) {
            String outFileName = String.format("test%1$S.doc",i);
            Doc wordout=readResult.get(i);
            WordUtil.createWord(wordout, "wangdong.xml", filePath, outFileName);
        }




    }
}
