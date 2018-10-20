package com.chessa.example.springJpa.kotlinJpaOnetoMany.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity @Table(name = "mobil")
data class Mobil(
    var name: String = "",

	var kode_chassing: String = "",

	var produksi: String="",

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_jenis_mobil")
    var jenisMobil: JenisMobil? = null,
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	var id: Long = 0
){
	override fun toString(): String{
		return "{name: ${name}, kode_chassing: ${kode_chassing}, produksi: ${produksi}, jenis_mobil: ${jenisMobil?.name}}"
	}
}
