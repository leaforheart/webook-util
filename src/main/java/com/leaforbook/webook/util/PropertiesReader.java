package com.leaforbook.webook.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

import com.leaforbook.webook.util.constant.TypeConstants;
import com.leaforbook.webook.util.exception.CastPropertiesValueException;
import com.leaforbook.webook.util.exception.LoadPropertiesFileException;

public class PropertiesReader implements java.io.Serializable {

	private static final long serialVersionUID = 8917594132468115539L;
	
	private Properties properties = new Properties();
	private String path;

	public PropertiesReader (String path) throws LoadPropertiesFileException {
		InputStream input = null;
		try {
			input = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
			properties.load(input);
			this.path=path;
		} catch (IOException e) {
			throw new LoadPropertiesFileException(path);
		} finally {
			try {
				if(input!=null) {
					input.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public String getString(String key) {
		return properties.getProperty(key);
	}
	
	public String getString(String key,String defaultValue) {
		String value = properties.getProperty(key);
		if(StringUtils.isEmpty(value)) {
			return defaultValue;
		}
		return value;
	}
	
	public int getInt(String key) throws CastPropertiesValueException {
		String svalue = properties.getProperty(key);
		if(StringUtils.isEmpty(svalue)) {
			throw new CastPropertiesValueException(path,key,svalue,TypeConstants.TYPE_INT);
		}
		int ivalue = 0;
		try {
			ivalue = Integer.parseInt(svalue);
		} catch (Throwable e) {
			throw new CastPropertiesValueException(path,key,svalue,TypeConstants.TYPE_INT);
		}
		return ivalue;
	}
	
	public int getInt(String key,int defaultValue) {
		String svalue = properties.getProperty(key);
		if(StringUtils.isEmpty(svalue)) {
			return defaultValue;
		}
		int ivalue = 0;
		try {
			ivalue = Integer.parseInt(svalue);
		} catch (Throwable e) {
			return defaultValue;
		}
		return ivalue;
	}
	
	public long getLong(String key) throws CastPropertiesValueException {
		String svalue = properties.getProperty(key);
		if(StringUtils.isEmpty(svalue)) {
			throw new CastPropertiesValueException(path,key,svalue,TypeConstants.TYPE_LONG);
		}
		long lvalue = 0L;
		try {
			lvalue = Long.parseLong(svalue);
		} catch (Throwable e) {
			throw new CastPropertiesValueException(path,key,svalue,TypeConstants.TYPE_LONG);
		}
		return lvalue;
	}
	
	public long getLong(String key,long defaultValue) {
		String svalue = properties.getProperty(key);
		if(StringUtils.isEmpty(svalue)) {
			return defaultValue;
		}
		long lvalue = 0L;
		try {
			lvalue = Long.parseLong(svalue);
		} catch (Throwable e) {
			return defaultValue;
		}
		return lvalue;
	}
	
	public short getShort(String key) throws CastPropertiesValueException {
		String svalue = properties.getProperty(key);
		if(StringUtils.isEmpty(svalue)) {
			throw new CastPropertiesValueException(path,key,svalue,TypeConstants.TYPE_SHORT);
		}
		short shvalue = 0;
		try {
			shvalue = Short.parseShort(svalue);
		} catch (Throwable e) {
			throw new CastPropertiesValueException(path,key,svalue,TypeConstants.TYPE_SHORT);
		}
		return shvalue;
	}
	
	public short getShort(String key,short defaultValue) {
		String svalue = properties.getProperty(key);
		if(StringUtils.isEmpty(svalue)) {
			return defaultValue;
		}
		short shvalue = 0;
		try {
			shvalue = Short.parseShort(svalue);
		} catch (Throwable e) {
			return defaultValue;
		}
		return shvalue;
	}
	
	public float getFloat(String key) throws CastPropertiesValueException {
		String svalue = properties.getProperty(key);
		if(StringUtils.isEmpty(svalue)) {
			throw new CastPropertiesValueException(path,key,svalue,TypeConstants.TYPE_FLOAT);
		}
		float fvalue = 0;
		try {
			fvalue = Float.parseFloat(svalue);
		} catch (Throwable e) {
			throw new CastPropertiesValueException(path,key,svalue,TypeConstants.TYPE_FLOAT);
		}
		return fvalue;
	}
	
	public float getFloat(String key,float defaultValue) {
		String svalue = properties.getProperty(key);
		if(StringUtils.isEmpty(svalue)) {
			return defaultValue;
		}
		float fvalue = 0;
		try {
			fvalue = Float.parseFloat(svalue);
		} catch (Throwable e) {
			return defaultValue;
		}
		return fvalue;
	}
	
	public double getDouble(String key) throws CastPropertiesValueException {
		String svalue = properties.getProperty(key);
		if(StringUtils.isEmpty(svalue)) {
			throw new CastPropertiesValueException(path,key,svalue,TypeConstants.TYPE_DOUBLE);
		}
		double dvalue = 0;
		try {
			dvalue = Double.parseDouble(svalue);
		} catch (Throwable e) {
			throw new CastPropertiesValueException(path,key,svalue,TypeConstants.TYPE_DOUBLE);
		}
		return dvalue;
	}
	
	public double getDouble(String key,double defaultValue) {
		String svalue = properties.getProperty(key);
		if(StringUtils.isEmpty(svalue)) {
			return defaultValue;
		}
		double dvalue = 0;
		try {
			dvalue = Double.parseDouble(svalue);
		} catch (Throwable e) {
			return defaultValue;
		}
		return dvalue;
	}
	
	public boolean getBoolean(String key) throws CastPropertiesValueException {
		String svalue = properties.getProperty(key);
		if(StringUtils.isEmpty(svalue)) {
			throw new CastPropertiesValueException(path,key,svalue,TypeConstants.TYPE_BOOLEAN);
		}
		boolean bvalue = false;
		try {
			bvalue = Boolean.parseBoolean(svalue);
		} catch (Throwable e) {
			throw new CastPropertiesValueException(path,key,svalue,TypeConstants.TYPE_BOOLEAN);
		}
		return bvalue;
	}
	
	public boolean getBoolean(String key,boolean defaultValue) {
		String svalue = properties.getProperty(key);
		if(StringUtils.isEmpty(svalue)) {
			return defaultValue;
		}
		boolean bvalue = false;
		try {
			bvalue = Boolean.parseBoolean(svalue);
		} catch (Throwable e) {
			return defaultValue;
		}
		return bvalue;
	}
	
}
