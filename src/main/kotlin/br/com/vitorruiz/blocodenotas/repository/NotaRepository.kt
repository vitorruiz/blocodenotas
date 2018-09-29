package br.com.vitorruiz.blocodenotas.repository

import br.com.vitorruiz.blocodenotas.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NotaRepository : MongoRepository<Nota, String> {

    fun findByTitulo(titulo: String): Nota
}