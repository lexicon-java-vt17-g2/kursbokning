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
	private static final long serialVersionUID = 1L;

	@Inject
	private StudentService service;

	@Override
	public List<Student> load(int first, int limit, String sortField, SortOrder order, Map<String, Object> filters) {
		this.setRowCount((int)service.numberOfEntries());
		return service.list(first, limit);
	}
}
