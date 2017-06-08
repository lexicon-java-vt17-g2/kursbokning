package se.lexicon.javavt17g2.kursbokning.service;

import java.util.List;

import javax.ejb.Local;

import se.lexicon.javavt17g2.kursbokning.domain.Course;

@Local
public interface CourseService {
	List<Course> list();
}
