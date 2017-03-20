package cn.edu.ustb.rs.table;
import java.util.*;
/**
 * 该类存贮了所有的Table
 * @author phantom
 *
 */
public class TableList {
	
	public TableList(){
		this.list = new Table[2] ;
		Table table1 = new Table("name1", 1) ;
		Table table2 = new Table("name2", 2) ;
		this.list[0] = table1 ;
		this.list[1] = table2 ;
	}
	public Table[] list ;
}
