package org.zerock.mapper.lecture;

import java.time.LocalDate;
import java.util.Date;

import org.apache.ibatis.annotations.Select;

public interface Mapper01 {
	
	@Select("SELECT NOW()")
	public String getCurrentTime();

	@Select("SELECT CustomerName FROM w3schools.Customers WHERE CustomerId = 77")
	public String getCustomerName();
	
	public String getEmployeeName();
	
	public String getProductName();
	
	public double getPrice(); // result 타입과 return 타입은 일치한다?

	public int getQuantity();
	
//	public Date getBirthDate();
	
	public LocalDate getBirthDate();
}
