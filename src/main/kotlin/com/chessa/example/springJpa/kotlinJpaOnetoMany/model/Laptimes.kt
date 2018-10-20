package com.chessa.example.springJpa.kotlinJpaOnetoMany.model

import org.hibernate.validator.constraints.NotBlank
import javax.persistence.*

@Entity @Table(name = "laptimes")
data class Laptimes (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "times_id", unique = true, nullable = false)
        val times_id: Long=0,

        @get: NotBlank
        val rider_id: Long=0,

        @get: NotBlank
        val finish_laptime: String = "",

        @get: NotBlank
        val best_laptime: String = "",

        @get: NotBlank
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "rider_id", insertable = false, updatable = false, nullable = false)
        val riders: Riders?=null

) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return "Laptimes(times_id=$times_id, rider_id=$rider_id, finish_laptime='$finish_laptime', best_laptime='$best_laptime', riders=$riders)"
    }
}