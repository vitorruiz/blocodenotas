package br.com.vitorruiz.blocodenotas.service

import br.com.vitorruiz.blocodenotas.model.Nota
import br.com.vitorruiz.blocodenotas.repository.NotaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NotaService {

    @Autowired
    lateinit var notaRepository: NotaRepository

    fun salvar(nota: Nota): Nota {
        return notaRepository.save(nota)
    }

    fun buscarTodos(): List<Nota> {
        return notaRepository.findAll()
    }

    fun buscarPorId(id: String): Nota {
        return notaRepository.findById(id).get()
    }

    fun buscarPorTitulo(titulo: String): Nota {
        return notaRepository.findByTitulo(titulo)
    }

    fun deletar(id: String) {
        notaRepository.deleteById(id)
    }

}