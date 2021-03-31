package io.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.web.servlet.view.document.AbstractExcelView;


public class ExcelView extends AbstractExcelView {
	
	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setHeader("Content-Disposition", "attachment;filename=\"users.xls\"");
        
		
		List<Employee> emp =(List<Employee>) model.get("empList");
		
		HSSFSheet sheet = workbook.createSheet("Employee Data");
		HSSFRow header = sheet.createRow(0);
		
        header.createCell(0).setCellValue("Employee ID");
        header.createCell(1).setCellValue("Employee Name");
        header.createCell(2).setCellValue("Employee Salary");
        
        int rowCount = 1;
        for(Employee empL:emp){
        	HSSFRow row = sheet.createRow(rowCount++);
            row.createCell(0).setCellValue(emp.getId());
            row.createCell(1).setCellValue(emp.getName());
            row.createCell(2).setCellValue(emp.getSalary());

	
}
