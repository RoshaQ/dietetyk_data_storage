package com.dietetykadam.persistence.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "client")
@Setter
@Getter
public class ClientEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClientEntity(ClientEntityBuilder builder) {
		this.id = builder.id;
		this.imie = builder.imie;
		this.nazwisko = builder.nazwisko;
		this.wiek = builder.wiek;
		this.wzrost = builder.wzrost;
		this.telefon = builder.telefon;
		this.dataClientEntities = builder.dataClientEntities;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;

	@Column(nullable = false, length = 45)
	private String imie;

	@Column(nullable = false, length = 45)
	private String nazwisko;

	@Column(nullable = false, length = 11)
	private int wiek;

	@Column(nullable = false, length = 11)
	private int wzrost;

	@Column(nullable = true, length = 12)
	private String telefon;
	
	@OneToMany(mappedBy="client", cascade = CascadeType.ALL)
	private Collection<DataClientEntity> dataClientEntities;
	

	public static class ClientEntityBuilder {

		public ClientEntityBuilder() {

		}

		private long id;

		private String imie;

		private String nazwisko;

		private int wiek;

		private int wzrost;

		private String telefon;
		
		private Collection<DataClientEntity> dataClientEntities;

		public ClientEntityBuilder id(long id) {
			this.id = id;
			return this;
		}

		public ClientEntityBuilder imie(String imie) {
			this.imie = imie;
			return this;
		}

		public ClientEntityBuilder nazwisko(String nazwisko) {
			this.nazwisko = nazwisko;
			return this;
		}

		public ClientEntityBuilder wiek(int wiek) {
			this.wiek = wiek;
			return this;
		}

		public ClientEntityBuilder telefon(String telefon) {
			this.telefon = telefon;
			return this;
		}
		
		public ClientEntityBuilder dataClientEntities(Collection<DataClientEntity> dataClientEntieties){
			this.dataClientEntities = dataClientEntieties;
			return this;
		}

		public ClientEntity build() {
			return new ClientEntity(this);
		}
	}

}
