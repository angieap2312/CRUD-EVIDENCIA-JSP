package com.example.demo.controller;

import com.example.demo.dao.entities.Estudiante;
import com.example.demo.services.CrudService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private CrudService crudService;

    // Mostrar la lista de artículos
    @GetMapping("/ver-todos")
    public String listarestudiante(Model model) {
        model.addAttribute("estudiantes", crudService.obtenerTodosLosEstudiantes());
        return "lista-estudiantes";
    }

    // Mostrar formulario para crear un nuevo estudiante
    @GetMapping("/crear-nuevo-estudiante")
    public String mostrarFormularioDeCrear(Model model) {
        model.addAttribute("nuevoEstudiante", new Estudiante());
        return "estudiante-nuevo";
    }

    // Metodo para crear un nuevo estudiante
    @PostMapping("/crear")
    public String guardarEstudiante(@ModelAttribute("nuevoEstudiante") Estudiante estudiante, RedirectAttributes redirectAttributes) {
        System.out.println(estudiante.getDocEst());
        crudService.guardarEstudiante(estudiante);
        redirectAttributes.addFlashAttribute("mensaje", "Estudiante guardado con éxito!");
        return "redirect:/estudiante/ver-todos";
    }

    // Mostrar formulario para editar un estudiante existente
    @GetMapping("/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable("id") String id, Model model) {
        model.addAttribute("nuevoEstudiante", crudService.obtenerEstudiantePorId(id));
        return "estudiante-nuevo";
    }

    @PostMapping("/actualizar-estudiante")
    public String actualizarEstudiante(@ModelAttribute("nuevoEstudiante") Estudiante estudiante, RedirectAttributes redirectAttributes) {
        crudService.guardarEstudiante(estudiante);
        redirectAttributes.addFlashAttribute("mensaje", "Estudiante actualizado con éxito!");
        return "redirect:/estudiante/ver-todos";
    }

    // Eliminar estudiante
    @GetMapping("/eliminar/{id}")
    public String eliminarEstudiante(@PathVariable("id") String id) {
        crudService.eliminarEstudiante(id);
        return "redirect:/estudiante/ver-todos";
    }
}