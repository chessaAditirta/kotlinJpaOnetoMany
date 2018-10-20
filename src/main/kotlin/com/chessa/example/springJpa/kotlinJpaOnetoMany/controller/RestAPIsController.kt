package com.chessa.example.springJpa.kotlinJpaOnetoMany.controller


import com.chessa.example.springJpa.kotlinJpaOnetoMany.model.JenisMobil
import com.chessa.example.springJpa.kotlinJpaOnetoMany.model.Mobil
import com.chessa.example.springJpa.kotlinJpaOnetoMany.repository.JenisMobilRepository
import com.chessa.example.springJpa.kotlinJpaOnetoMany.repository.MobilRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class RestAPIsController {
	
	@Autowired
	lateinit var jenisMobilRepository: JenisMobilRepository
	
	@Autowired
	lateinit var mobilRepository: MobilRepository

	@RequestMapping("/save/1")
	fun save(): String {
		// clear data
		mobilRepository.deleteAll()
		jenisMobilRepository.deleteAll()
		
		// prepare Jenis Mobil data
		val suv = JenisMobil("Suv")
		val coupe = JenisMobil("Coupe")
		
		// save list of companies to database
		jenisMobilRepository.save(setOf(suv, coupe))
		
		// prepare Mobil data
		val rav4 = Mobil("RAV4", "XA10", "Toyoda", suv)
		val santaFe = Mobil("Santa Fe", "DM", "Hyundai", suv)
		val crv = Mobil("CR-V Type S", "GM", "Honda", suv)
		
		val ae86 = Mobil("Sprinter Trueno", "AE86", "Toyoda", coupe)
		val fc = Mobil("Savanna", "RX-7 FC", "Mazda", coupe)
		val brz = Mobil("GT-86/BRZ", "FT-86/BRZ", "Subaru and Toyoda", coupe)
		
		// save list of mobils to database
		mobilRepository.save(setOf(rav4, santaFe, crv, ae86, fc, brz))
		
		return "saving with approach 1 - done!"
	}
	
	@RequestMapping("/save/2")
	fun save2(): String {
		// clear data
		mobilRepository.deleteAll()
		jenisMobilRepository.deleteAll()

		// prepare Jenis Mobil data
		val suv = JenisMobil("Suv")
		val coupe = JenisMobil("Coupe")

		// save list of companies to database
		jenisMobilRepository.save(setOf(suv, coupe))

		// prepare Mobil data
		val rav4 = Mobil("RAV4", "XA10", "Toyoda", suv)
		val santaFe = Mobil("Santa Fe", "DM", "Hyundai", suv)
		val crv = Mobil("CR-V Type S", "GM", "Honda", suv)

		val ae86 = Mobil("Sprinter Trueno", "AE86", "Toyoda", coupe)
		val fc = Mobil("Savanna", "RX-7 FC", "Mazda", coupe)
		val brz = Mobil("GT-86/BRZ", "FT-86/BRZ", "Subaru and Toyoda", coupe)

		// save list of mobils to database
		mobilRepository.save(setOf(rav4, santaFe, crv, ae86, fc, brz))

		return "saving with approach 2 - done!"
		
		return "saving with approach 2 - done!"
	}
	
	@RequestMapping("/jenisMobils")
	fun findAllJenisMobils() : String {
		// fetch all jenisMobils data from database
		val jenisMobils = jenisMobilRepository.findAll()
		
		// some processing for better String format on browser showing 
		var info : String = ""
		jenisMobils.forEach{
			info += it.toString() + "<br>"
		}
		
		return info
	} 
	
	@RequestMapping("/mobils")
	fun findAllMobils() : String {
		// fetch all mobils from database
		val mobils = mobilRepository.findAll()
		
		// some processing codes for better String format on browser showing
		var info : String = ""
		
		mobils.forEach{
			info += it.toString() + "<br>"
		}
		
		return info
	} 
}