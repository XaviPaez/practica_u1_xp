package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Estudiante;

public interface IEstudianteService {

	public void insertarEstudiante(Estudiante e);

	public Estudiante buscarEstudiante(String apellido);

	public void actualizarPorApellido(Estudiante e);

	public void eliminarEstudiante(String cedula);
	
}
