package me.wuwenbin.http.javanet;


import me.wuwenbin.http.common.exception.HttpProcessException;
import me.wuwenbin.http.javanet.base.SendDataByHTTP;
import me.wuwenbin.http.javanet.base.SendDataByHTTPS;

/**
 * 
 * <b>ClassName</b>: BnHttpJavaNetUtils<br>
 * <b>Description</b>: java.net.url方式下的http请求<br>
 * <b>Version</b>: Ver 1.0<br>
 *
 * <b>author</b>: Wuwenbin<br>
 * <b>date</b>: 2016年9月1日<br>
 * <b>time</b>: 下午4:09:43 <br>
 */
public class HttpJavaNetUtils {
	/**
	 * 
	 * <b>Author</b> : Wuwenbin<br>
	 * <b>Title</b> : sendByHttp<br>
	 * <b>Description</b> : UTF8默认方式请求HTTP<br>
	 * 
	 * @param data
	 * @param url
	 * @param contentType
	 * @return
	 * @throws HttpProcessException
	 */
	public static String sendByHttp(String data, String url, String contentType) throws HttpProcessException {
		return new SendDataByHTTP().send(data, url, contentType);
	}

	/**
	 * 
	 * <b>Author</b> : Wuwenbin<br>
	 * <b>Title</b> : sendByHttpWithEncoding<br>
	 * <b>Description</b> : 以设置的编码方式请求HTTP<br>
	 * 
	 * @param data
	 * @param url
	 * @param contentType
	 * @param encoding
	 * @return
	 * @throws HttpProcessException
	 */
	public static String sendByHttpWithEncoding(String data, String url, String contentType, String encoding) throws HttpProcessException {
		return new SendDataByHTTP().send(data, url, contentType, encoding);
	}

	/**
	 * 
	 * <b>Author</b> : Wuwenbin<br>
	 * <b>Title</b> : sendByHttp<br>
	 * <b>Description</b> : UTF8默认方式请求HTTPS<br>
	 * 
	 * @param data
	 * @param url
	 * @param contentType
	 * @return
	 * @throws HttpProcessException
	 */
	public static String sendByHttps(String data, String url, String contentType) throws HttpProcessException {
		return new SendDataByHTTPS().send(data, url, contentType);
	}

	/**
	 * 
	 * <b>Author</b> : Wuwenbin<br>
	 * <b>Title</b> : sendByHttpWithEncoding<br>
	 * <b>Description</b> : 以设置的编码方式请求HTTPS<br>
	 * 
	 * @param data
	 * @param url
	 * @param contentType
	 * @param encoding
	 * @return
	 * @throws HttpProcessException
	 */
	public static String sendByHttpsWithEncoding(String data, String url, String contentType, String encoding) throws HttpProcessException {
		return new SendDataByHTTPS().send(data, url, contentType, encoding);
	}
}