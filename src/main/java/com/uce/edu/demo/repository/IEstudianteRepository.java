package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;

public interface IEstudianteRepository {

	public void insertar(Estudiante e);

	public Estudiante buscar(String apellido);

	public void actualizar(Estudiante e);

	public void eliminar(String cedula);

}
