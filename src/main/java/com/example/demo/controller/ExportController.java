package com.example.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;

//第二次提交
@Controller
public class ExportController {
    @RequestMapping("/export")
    public void export(HttpServletResponse response){
        //excel文件名
        String fileName = "用户信息表" + System.currentTimeMillis() + ".xlsx";

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("sheet1");
        XSSFRow row = sheet.createRow(0);


//        CellStyle cellStyle = wb.createCellStyle();
//        XSSFDataFormat dataFormat = wb.createDataFormat();
//        cellStyle.setDataFormat(dataFormat.getFormat("@"));

        XSSFFont font = wb.createFont();
        font.setBold(true);
        CellStyle cellStyle = wb.createCellStyle();
        cellStyle.setFont(font);

        for (int i = 0 ;i <= 10;i++){
//            sheet.setDefaultColumnStyle(i,cellStyle);
            XSSFCell cell = row.createCell(i);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("哈哈"+i);
        }
        for (int j = 0 ;j <= 10000;j++){
            XSSFRow row1 = sheet.createRow(j+1);
            for (int i = 0 ;i <= 10;i++){
//            sheet.setDefaultColumnStyle(i,cellStyle);
                XSSFCell cell = row1.createCell(i);
//            cell.setCellStyle(cellStyle);
                cell.setCellValue("哈哈"+i);
            }
        }

        try {
            response.setContentType("application/octet-stream;charset=ISO8859-1");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
            response.addHeader("Pargam", "no-cache");
            response.addHeader("Cache-Control", "no-cache");
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
