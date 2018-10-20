package com.chessa.example.springJpa.kotlinJpaOnetoMany.model

import org.hibernate.validator.constraints.NotBlank
import javax.persistence.*
import kotlin.reflect.KClass

@Entity @Table(name = "riders")
data class Riders (

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rider_id", unique = true, nullable = false)
    val rider_id: Long = 0,

    @get: NotBlank
    val fullname: String = "",

    @get: NotBlank
    val country: String = "",

    @get: NotBlank
    val number: String = "",

    @get: NotBlank
    val teams_id: Long = 0,

    @get: NotBlank
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teams_id", insertable = false, updatable = false, nullable = false)
    val teams: Teams? = null,

    @get: NotBlank
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "riders")
    val laptimes: List<Laptimes> = emptyList()

) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return "Riders(rider_id=$rider_id, fullname='$fullname', country='$country', number='$number', teams_id=$teams_id, teams=$teams, laptimes=$laptimes)"
    }
}
