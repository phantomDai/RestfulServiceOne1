package cn.edu.ustb.rs.table;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlElement;

/**
 * 实现了一个Element的接口
 */
import cn.edu.ustb.rs.inter.Element;
@XmlRootElement
public class Table implements Element {
	String name;
	int id ;
	
	/**
	 * 必须要有这个无参的构造器否则会报错
	 */
	public Table(){}
	/**
	 * 通过这个构造器创建新的table
	 * @param name
	 * @param id
	 */
	public Table(String name, int id){
		this.setName(name);
		this.setId(id);
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name ;
	}
	public void setId(int id){
		this.id = id ;
	}
	@XmlElement
	public String getName(){
		return this.name ;
	}
	@XmlElement
	public int getId(){
		return this.id ;
	}
	
	


}
