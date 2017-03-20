package cn.edu.ustb.rs.table;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlElement;

/**
 * ʵ����һ��Element�Ľӿ�
 */
import cn.edu.ustb.rs.inter.Element;
@XmlRootElement
public class Table implements Element {
	String name;
	int id ;
	
	/**
	 * ����Ҫ������޲εĹ���������ᱨ��
	 */
	public Table(){}
	/**
	 * ͨ����������������µ�table
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
