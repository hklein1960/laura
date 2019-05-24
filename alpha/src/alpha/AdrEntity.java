package alpha;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: AdrEntity
 *
 */
@Entity

public class AdrEntity implements Serializable {

	   
	@Id
	private Long id;
	private String Ort;
	private static final long serialVersionUID = 1L;

	public AdrEntity() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getOrt() {
		return this.Ort;
	}

	public void setOrt(String Ort) {
		this.Ort = Ort;
	}
   
}
