package entites;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Rdv {
	private LocalDateTime date;
	private String lieu;
	private String client;
	
	public Rdv(LocalDateTime date, String lieu, String client) {
		super();
		this.date = date;
		this.lieu = lieu;
		this.client = client;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(date);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rdv other = (Rdv) obj;
		return Objects.equals(date, other.date);
	}

	@Override
	public String toString() {
		DateTimeFormatter f= DateTimeFormatter.ofPattern("dd/MM/yyyy 'à' HH'h'mm");
		return date.format(f)+ ", lieu : "+ lieu + ", client : " + client ;
	}
	
	

}
