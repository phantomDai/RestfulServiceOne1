package cn.edu.ustb.rs.publish;
import cn.edu.ustb.rs.impl.*;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * 发布服务的类
 * @author phantom
 *
 */
public class Publish {
	public static void main(String[] args){
	JAXRSServerFactoryBean rs = new JAXRSServerFactoryBean() ;
	SchemaService ss = new SchemaService() ;
	rs.setServiceBean(ss) ;
	rs.setAddress("http://127.0.0.1:8084/") ;
	rs.create() ;
	}
}
