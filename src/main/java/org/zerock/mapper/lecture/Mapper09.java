package org.zerock.mapper.lecture;

import java.util.List;

import org.zerock.domain.lecture.JavaBean04;
import org.zerock.domain.lecture.JavaBean16;
import org.zerock.domain.lecture.JavaBean17;

public interface Mapper09 { 

	String getCustomerNameById(int id);

	String getEmployeeNameById(int id);
	
	List<String> getCustomerNameByCityAndCountry(String country, String city);

	List<String> getSupplierNameByCityAndCountry(String nation, String location);
	
	String getContactName(JavaBean04 bean1);

	String getSupplierContactName(JavaBean04 bean2);
	
	List<String> getProductName(JavaBean16 arg1, JavaBean17 arg2);
}
