package se.lexicon.javavt17g2.kursbokning.faces;

import java.util.List;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import se.lexicon.javavt17g2.kursbokning.domain.Student;
import se.lexicon.javavt17g2.kursbokning.service.StudentService;

@ApplicationScoped
public class StudentsLazyDataModel extends LazyDataModel<Student> {
	@Inject
	private StudentService service;

	@Override
	public List<Student> load(int first, int limit, String sortField, SortOrder order, Map<String, Object> filters) {
		System.out.println("OK: " + first + ", " + limit);
		return service.list(first, limit);
	}

	@Override
	public int getRowCount() {
		return (int)service.numberOfEntries();
	}
}
