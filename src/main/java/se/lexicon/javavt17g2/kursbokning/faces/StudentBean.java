package se.lexicon.javavt17g2.kursbokning.faces;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

import se.lexicon.javavt17g2.kursbokning.domain.Student;
import se.lexicon.javavt17g2.kursbokning.service.StudentService;

@Model @Named("student")
public class StudentBean {
	@Inject
	private StudentService service;

	public List<Student> getList() {
		return service.list(0, 50);
	}
}
