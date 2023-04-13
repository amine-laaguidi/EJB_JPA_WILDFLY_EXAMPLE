package controller;

import dao.StudentDao;
import jakarta.inject.Inject;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/rest")
public class ServletJAX {
    @Inject
    StudentDao studentDao;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudentList(){
//        return "hello";
        Jsonb jsonb = JsonbBuilder.create();
        String jsonStr =  jsonb.toJson(studentDao.list());
        return Response.ok(jsonStr).build();
    }
}
