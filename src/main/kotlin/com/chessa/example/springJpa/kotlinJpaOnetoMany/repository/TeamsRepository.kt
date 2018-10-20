package com.chessa.example.springJpa.kotlinJpaOnetoMany.repository

import com.chessa.example.springJpa.kotlinJpaOnetoMany.model.Teams
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TeamsRepository : JpaRepository<Teams, Long> {
}