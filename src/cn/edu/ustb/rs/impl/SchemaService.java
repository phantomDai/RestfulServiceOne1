package cn.edu.ustb.rs.impl;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;


import cn.edu.ustb.rs.table.*;
/**
 * Restful服务的根节点
 * @author phantom
 *
 */

@WebService(targetNamespace="http://www.ustb.edu.cn/sei/ws")
@Path(value="/schema/tables/")
@Produces(MediaType.APPLICATION_XML)


public class SchemaService {
	TableList tlist = new TableList();
	@GET
	@Path(value="/{id}")
	public Table item(@PathParam(value="id")Integer id){
		return tlist.list[id] ;
	}
}

	
