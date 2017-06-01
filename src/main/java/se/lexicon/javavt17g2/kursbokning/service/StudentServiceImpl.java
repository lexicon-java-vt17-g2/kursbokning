package se.lexicon.javavt17g2.kursbokning.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import se.lexicon.javavt17g2.kursbokning.domain.Student;

@Stateless
public class StudentServiceImpl implements StudentService {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Student> list(int first, int limit) {
		return em.createQuery("SELECT student FROM Student student", Student.class).setFirstResult(first).setMaxResults(limit).getResultList();
	}

	@Override
	public Student get(long id) {
		return em.find(Student.class, id);
	}
}
