package com.cg;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.cg.BO.EmpBO;
import com.cg.EO.EmpEO;



@Mapper(componentModel = "spring")
public interface EmpMap {
	
	EmpMap INSTANCE = Mappers.getMapper(EmpMap.class);

	EmpBO employee_BO(EmpEO empEO);
	EmpEO employee_EO(EmpBO empBO);
}
