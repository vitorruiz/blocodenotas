package br.com.vitorruiz.blocodenotas.controller

import br.com.vitorruiz.blocodenotas.model.Nota
import br.com.vitorruiz.blocodenotas.service.NotaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/nota")
class NotaController {

    @Autowired
    lateinit var notaService: NotaService

    @GetMapping("/check")
    fun checkHealth(): String {
        return "OK"
    }

    @GetMapping()
    fun buscarTodos(): List<Nota> {
        return notaService.buscarTodos()
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable("id") id: String): Nota {
        return notaService.buscarPorId(id)
    }

    @GetMapping("/titulo/{titulo}")
    fun buscarPorTitulo(@PathVariable("titulo") titulo: String): Nota {
        return notaService.buscarPorTitulo(titulo)
    }

    @PostMapping()
    fun salvar(@RequestBody nota: Nota): Nota {
        return notaService.salvar(nota)
    }

    @DeleteMapping("/{id}")
    fun deletar(@PathVariable("id") id: String) {
        notaService.deletar(id)
    }
}