package com.chessa.example.springJpa.kotlinJpaOnetoMany.model

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table


@Entity @Table(name = "jenis_mobil")
data class JenisMobil(
		var name: String = "",

		@OneToMany(mappedBy = "id_jenis_mobil", cascade = arrayOf(CascadeType.ALL), fetch = FetchType.EAGER)
    var mobils: List<Mobil> = emptyList(),


		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	var id: Long = 0
){
	override fun toString(): String{
		return "{name: ${this.name}, mobils: ${mobils.map { it->it.name }}}";
	}
}