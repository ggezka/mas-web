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

import smkbangsri.entity.Anggota;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Path("/anggota")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Api(value = "/anggota")
public interface AnggotaService {
	@GET
	@Path("/{id}")
	@ApiOperation(value ="Find Anggota By ID", response = Anggota.class)
	Anggota getAnggotaById(@PathParam("id") @ApiParam("Anggota Id") long id);
	
	@GET
	@ApiOperation(value ="Find Anggota By Nama", response = Anggota.class, responseContainer = "List")
	List<Anggota>findAnggotaByNama(@QueryParam("nama") @DefaultValue("") String nama);
	//membuat data
	@POST
	@ApiOperation(value ="Save Anggota", response = Anggota.class)
	Anggota saveAnggota(Anggota anggota);
	// 
	@PUT
	@Path("/{id}")
	@ApiOperation(value ="Update Anggota", response = Anggota.class)
	Anggota updateAnggota(@PathParam("id") @ApiParam("Anggota Id") long id, Anggota anggota);
	
	@DELETE
	@Path("/{id}")
	@ApiOperation(value ="Delete Anggota", response = Anggota.class)
	void deleteAnggota(@PathParam("id") @ApiParam("Anggota Id") long id);
}
