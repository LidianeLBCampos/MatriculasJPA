package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the matriculas database table.
 * 
 */
@Embeddable
public class MatriculaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_curso", insertable=false, updatable=false)
	private int idCurso;

	@Column(name="id_alumno", insertable=false, updatable=false)
	private int idAlumno;

	public MatriculaPK() {
	}
	public int getIdCurso() {
		return this.idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public int getIdAlumno() {
		return this.idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MatriculaPK)) {
			return false;
		}
		MatriculaPK castOther = (MatriculaPK)other;
		return 
			(this.idCurso == castOther.idCurso)
			&& (this.idAlumno == castOther.idAlumno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCurso;
		hash = hash * prime + this.idAlumno;
		
		return hash;
	}
}