package se.lexicon.javavt17g2.kursbokning.rest;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import se.lexicon.javavt17g2.kursbokning.domain.Student;
import se.lexicon.javavt17g2.kursbokning.service.StudentService;

@Path("student")
public class StudentController {
	@Inject
	private StudentService service;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> list(
			@QueryParam("first") @DefaultValue("0") @Valid @Min(0) int first,
			@QueryParam("limit") @DefaultValue("10") @Valid @Min(1) @Max(100) int limit)
	{
		return service.list(first, limit);
	}
}
