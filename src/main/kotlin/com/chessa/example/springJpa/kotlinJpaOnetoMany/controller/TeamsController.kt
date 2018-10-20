package com.chessa.example.springJpa.kotlinJpaOnetoMany.controller

import com.chessa.example.springJpa.kotlinJpaOnetoMany.model.Teams
import com.chessa.example.springJpa.kotlinJpaOnetoMany.repository.TeamsRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController @RequestMapping("/api")
class TeamsController (private val teamsRepository: TeamsRepository){
    //create new one of teams


    //get all of teams


    //get one teams by id

    //edit one of teams by id
   @PutMapping("/teams/{id}")
    fun updateTeamById(@PathVariable(value = "id") team_id: Long,
                       @Valid @RequestBody newTeam: Teams): ResponseEntity<Teams>{
        return teamsRepository.fin
    }


}