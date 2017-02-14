package smkbangsri.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import smkbangsri.entity.Buku;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Path("/buku")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(value = "/buku")
public interface BukuService {
	@GET
	@Path("/{id}")
	@ApiOperation(value = "Find buku by ID", response = Buku.class)
	Buku getBukuById(@PathParam("id") @ApiParam("Buku ID") long id);
	
	@GET
	@ApiOperation(value = "Find buku By Judul", response = Buku.class)
	List<Buku>findBukuByJudul(@QueryParam("judul")@DefaultValue("") String judul);
	
	@POST
	@ApiOperation(value = "Save buku", response = Buku.class)
	Buku saveBuku(Buku buku);
	
	@PUT
	@Path("/{id}")
	@ApiOperation(value = "Update buku", response = Buku.class)
	Buku updateBuku(@PathParam("id") @ApiParam("Buku ID") long id, Buku buku);
	
	@DELETE
	@Path("/{id}")
	@ApiOperation(value = "Delete buku")
	void deleteBuku(@PathParam("id") @ApiParam("Buku ID") long id);
}

//rosyad29

