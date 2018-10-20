package com.chessa.example.springJpa.kotlinJpaOnetoMany.model

import org.hibernate.validator.constraints.NotBlank
import javax.persistence.*

@Entity @Table(name = "teams")
data class Teams(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teams_id", unique = true, nullable = false)
    val teams_id: Long = 0,

    @get: NotBlank
    val name: String = "",

    @get: NotBlank
    val moto_name: String = "",

    @get: NotBlank
    val moto_brand: String = "",

    @get: NotBlank
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "teams")
    val riders: List<Riders> = emptyList()


) {
    override fun toString(): String {
        return "Teams(teams_id=$teams_id, name='$name', moto_name='$moto_name', moto_brand='$moto_brand', riders=$riders)"
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
//    fun copy(name: String = this.name, age: Int = this.age) = User(name, age)
//    fun copy(teams_id: Long, name: String, moto_name: String, moto_brand: String) = Teams(teams_id, name, moto_name, moto_brand, riders)
}