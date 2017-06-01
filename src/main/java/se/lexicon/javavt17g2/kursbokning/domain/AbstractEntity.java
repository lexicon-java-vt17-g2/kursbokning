package se.lexicon.javavt17g2.kursbokning.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public abstract class AbstractEntity {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	public Long getId() { return this.id; }
	public void setId(Long id) {
		if(this.id != null)
			throw new IllegalStateException("Assigning id to non-transiant entity");
		this.id = id;
	}

	@Version
	private int version;
	public int getVersion() { return this.version; }
	public void setVersion(int version) { this.version = version; }
}
