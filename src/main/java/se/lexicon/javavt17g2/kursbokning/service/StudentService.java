package se.lexicon.javavt17g2.kursbokning.service;

import java.util.List;

import javax.ejb.Local;

import se.lexicon.javavt17g2.kursbokning.domain.Student;

@Local
public interface StudentService {
	List<Student> list(int first, int limit);
	Student get(long id);
}