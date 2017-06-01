package se.lexicon.javavt17g2.kursbokning.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Course extends AbstractEntity {
	@NotNull
	private String name;
	public String getName() { return this.name; }
	public void setName(String name) { this.name = name; }
}
