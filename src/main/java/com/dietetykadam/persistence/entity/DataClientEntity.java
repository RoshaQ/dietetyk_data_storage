package com.dietetykadam.persistence.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "data_client")
@Setter
@Getter
public class DataClientEntity implements Serializable {

	public DataClientEntity(DataClientEntityBuilder builder) {
		this.id = builder.id;
		this.client = builder.client;
		this.idKlienta = builder.idKlienta;
		this.dataPomiaru = builder.dataPomiaru;
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

	@ManyToOne
	private ClientEntity client;
	
	@Column(name = "id_klienta", nullable = false)
	private long idKlienta;

	@Column(nullable = false, length = 5)
	private double waga;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_pomiaru", columnDefinition = "DATE", nullable = false)
	private LocalDateTime dataPomiaru;

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

	public static class DataClientEntityBuilder {

		public DataClientEntityBuilder() {

		}

		private long id;
		
		private ClientEntity client;

		private long idKlienta;

		private double waga;

		private LocalDateTime dataPomiaru;

		private double tkankaTluszczowaWProcentach;

		private double tkankaTluszczowaWKilogramach;

		private double zawartoscWodyWProcentach;

		private double masaMiesni;

		private int wisceralnaTkankaTluszczowa;

		public DataClientEntityBuilder id(long id) {
			this.id = id;
			return this;
		}
		
		public DataClientEntityBuilder client(ClientEntity client){
			this.client = client;
			return this;
		}

		public DataClientEntityBuilder idKlienta(long idKlienta) {
			this.idKlienta = idKlienta;
			return this;
		}

		public DataClientEntityBuilder waga(double waga) {
			this.waga = waga;
			return this;
		}

		public DataClientEntityBuilder dataPomiaru(LocalDateTime dataPomiaru) {
			this.dataPomiaru = dataPomiaru;
			return this;
		}

		public DataClientEntityBuilder tkankaTluszczowaWProcentach(double tkankaTluszczowaWProcentach) {
			this.tkankaTluszczowaWProcentach = tkankaTluszczowaWProcentach;
			return this;
		}

		public DataClientEntityBuilder tkankaTluszczowaWKilogramach(double tkankaTluszczowaWKilogramach) {
			this.tkankaTluszczowaWKilogramach = tkankaTluszczowaWKilogramach;
			return this;
		}

		public DataClientEntityBuilder zawartoscWodyWProcentach(double zawartoscWodyWProcentach) {
			this.zawartoscWodyWProcentach = zawartoscWodyWProcentach;
			return this;
		}

		public DataClientEntityBuilder masaMiesni(double masaMiesni) {
			this.masaMiesni = masaMiesni;
			return this;
		}

		public DataClientEntityBuilder wisceralnaTkankaTluszczowa(int wisceralnaTkankaTluszczowa) {
			this.wisceralnaTkankaTluszczowa = wisceralnaTkankaTluszczowa;
			return this;
		}

		public DataClientEntity build() {
			return new DataClientEntity(this);
		}
	}
}
