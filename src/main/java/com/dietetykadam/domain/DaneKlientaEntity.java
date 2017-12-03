package com.dietetykadam.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "dane_klienta")
@Setter
@Getter
public class DaneKlientaEntity implements Serializable {

	public DaneKlientaEntity(DaneKlientaEntityBuilder builder) {
		this.id = builder.id;
		this.idKlienta = builder.idKlienta;
		this.data = builder.data;
		this.masaMiesni = builder.masaMiesni;
		this.tkankaTluszczowaWKilogramach = builder.tkankaTluszczowaWKilogramach;
		this.tkankaTluszczowaWProcentach = builder.tkankaTluszczowaWProcentach;
		this.waga = builder.waga;
		this.wisceralnaTkankaTluszczowa = builder.wisceralnaTkankaTluszczowa;
		this.zawartoscWodyWProcentach = builder.zawartoscWodyWProcentach;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "id_klienta", nullable = false)
	private long idKlienta;

	@Column(nullable = false, length = 5)
	private double waga;

	@Column(nullable = false)
	private LocalDateTime data;

	@Column(name = "tkanka_tluszczowa_procent", nullable = true, length = 4)
	private double tkankaTluszczowaWProcentach;

	@Column(name = "tkanka_tluszczowa_kg", nullable = true, length = 4)
	private double tkankaTluszczowaWKilogramach;

	@Column(name = "zawartosc_wody_procent", nullable = true, length = 4)
	private double zawartoscWodyWProcentach;

	@Column(name = "masa_miesni_kg", nullable = true, length = 4)
	private double masaMiesni;

	@Column(name = "wiceralna_tkanka_tluszczowa", nullable = true, length = 11)
	private int wisceralnaTkankaTluszczowa;

	public static class DaneKlientaEntityBuilder{
		
		public DaneKlientaEntityBuilder() {

		}

		private long id;

		private long idKlienta;

		private double waga;

		private LocalDateTime data;

		private double tkankaTluszczowaWProcentach;

		private double tkankaTluszczowaWKilogramach;

		private double zawartoscWodyWProcentach;

		private double masaMiesni;

		private int wisceralnaTkankaTluszczowa;

		public DaneKlientaEntityBuilder id(long id) {
			this.id = id;
			return this;
		}

		public DaneKlientaEntityBuilder idKlienta(long idKlienta) {
			this.idKlienta = idKlienta;
			return this;
		}

		public DaneKlientaEntityBuilder waga(double waga) {
			this.waga = waga;
			return this;
		}

		public DaneKlientaEntityBuilder data(LocalDateTime data) {
			this.data = data;
			return this;
		}
		
		public DaneKlientaEntityBuilder tkankaTluszczowaWProcentach(double tkankaTluszczowaWProcentach) {
			this.tkankaTluszczowaWProcentach = tkankaTluszczowaWProcentach;
			return this;
		}
		
		public DaneKlientaEntityBuilder tkankaTluszczowaWKilogramach(double tkankaTluszczowaWKilogramach) {
			this.tkankaTluszczowaWKilogramach = tkankaTluszczowaWKilogramach;
			return this;
		}
		
		public DaneKlientaEntityBuilder zawartoscWodyWProcentach(double zawartoscWodyWProcentach) {
			this.zawartoscWodyWProcentach = zawartoscWodyWProcentach;
			return this;
		}
		
		public DaneKlientaEntityBuilder masaMiesni(double masaMiesni) {
			this.masaMiesni = masaMiesni;
			return this;
		}
		
		public DaneKlientaEntityBuilder wisceralnaTkankaTluszczowa(int wisceralnaTkankaTluszczowa) {
			this.wisceralnaTkankaTluszczowa = wisceralnaTkankaTluszczowa;
			return this;
		}

		public DaneKlientaEntity build() {
			return new DaneKlientaEntity(this);
		}
	}
}
