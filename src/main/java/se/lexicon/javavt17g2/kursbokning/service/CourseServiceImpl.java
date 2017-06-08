package se.lexicon.javavt17g2.kursbokning.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import se.lexicon.javavt17g2.kursbokning.domain.Course;

@Stateless
public class CourseServiceImpl implements CourseService {
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Course> list() {
		return em.createQuery("SELECT course FROM Course course", Course.class).getResultList();
	}
}
