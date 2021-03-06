package se.lexicon.javavt17g2.kursbokning.faces;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.LazyDataModel;

import se.lexicon.javavt17g2.kursbokning.domain.Student;
import se.lexicon.javavt17g2.kursbokning.service.StudentService;

@Model @Named("students")
public class StudentsBean {
	@Inject
	private StudentService service;

	@Inject
	private LazyDataModel<Student> lazyModel;

	private Student single;

	public List<Student> getList() {
		return service.list(0, 10);
	}

	public LazyDataModel<Student> getLazyModel() {
		return this.lazyModel;
	}

	public Student getSingle() {
		return this.single;
	}

	public String bookCourses(Student student) {
		this.single = service.fetch(student);;
		return "book-course";
	}

	public void saveSingle() {
		service.save(single);
	}
}
