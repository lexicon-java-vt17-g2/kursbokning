package se.lexicon.javavt17g2.kursbokning.domain;

import java.util.Collections;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Student extends AbstractEntity {
	@NotNull
	private String name;
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }

	@ManyToMany
	private List<Course> courses;
	@JsonIgnore
	public List<Course> getCourses() { return Collections.unmodifiableList(this.courses); }
}
