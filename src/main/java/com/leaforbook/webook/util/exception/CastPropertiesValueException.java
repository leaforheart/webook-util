package com.leaforbook.webook.util.exception;

public class CastPropertiesValueException extends Exception {

	private static final long serialVersionUID = 7346359907058184497L;
	
	public CastPropertiesValueException() {}
	
	public CastPropertiesValueException(String path,String key,String value,String type) {
		super("Properties值类型转换错误："+path+"中的"+key+"的value为"+value+"，不能转化为"+type+"类型");
	}
	
}
