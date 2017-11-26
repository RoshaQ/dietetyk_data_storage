package com.dietetykadam.domain;

import java.io.Serializable;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "klient")
@Setter
@Getter
public class KlientEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public KlientEntity(KlientEntityBuilder builder) {
		this.id = builder.id;
		this.imie = builder.imie;
		this.nazwisko = builder.nazwisko;
		this.wiek = builder.wiek;
		this.wzrost = builder.wzrost;
		this.telefon = builder.telefon;
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
	
	@Column(nullable= true, length = 12)
	private String telefon;

	public static class KlientEntityBuilder {

		public KlientEntityBuilder() {

		}

		private long id;

		private String imie;

		private String nazwisko;

		private int wiek;

		private int wzrost;

		private String telefon;
		
		
		public KlientEntityBuilder id(long id){
			this.id = id;
			return this;
		}
		
		public KlientEntityBuilder imie(String imie){
			this.imie = imie;
			return this;
		}
		
		public KlientEntityBuilder nazwisko(String nazwisko){
			this.nazwisko = nazwisko;
			return this;
		}
		
		public KlientEntityBuilder wiek(int wiek){
			this.wiek = wiek;
			return this;
		}
		

		public KlientEntityBuilder telefon(String telefon){
			this.telefon = telefon;
			return this;
		}
		
		public KlientEntity build(){
			return new KlientEntity(this);
		}
	}

}
