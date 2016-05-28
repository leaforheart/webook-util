package com.leaforbook.webook.util.exception;

public class LoadPropertiesFileException extends Exception {
	private static final long serialVersionUID = -5686677488732043393L;
	public LoadPropertiesFileException() {}
	public LoadPropertiesFileException(String path) {
		super("Properties配置文件加载错误，请检查文件路径是否正确："+path);
	}
}
