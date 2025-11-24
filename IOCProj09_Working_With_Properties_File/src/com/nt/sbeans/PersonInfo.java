package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pinfo")
@PropertySource(value="com/nt/commons/Info.properties")
public class PersonInfo {
	@Value("${per.id}")
	private Integer pid;
	
	@Value("${per.pname}")
	private String pname;
	
	@Value("${per.addrs}")
	private String addrs;
	
	@Value("9182933731")
	private Long mobileNo;
	
	@Value("${os_name}")
	private String os_name;
	
	@Value("${os_ver}")
	private String os_ver;
	
	@Value("${path}")
	private String path_data;
	@Override 
	public String toString() {
		return "personInfo[pid="+pid+",pname="+pname+",addrs="+addrs+",mobileNo="+mobileNo+",os_name="+os_name+",os_ver"+os_ver+",path_data="+path_data+"]";
	}
	

}
