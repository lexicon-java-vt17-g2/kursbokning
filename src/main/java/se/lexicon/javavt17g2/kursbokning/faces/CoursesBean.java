package se.lexicon.javavt17g2.kursbokning.faces;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.inject.Named;

import se.lexicon.javavt17g2.kursbokning.domain.Course;
import se.lexicon.javavt17g2.kursbokning.service.CourseService;

@Model @Named("courses")
public class CoursesBean {
	@Inject
	private CourseService service;

	public List<Course> getList() {
		return service.list();
	}
}
