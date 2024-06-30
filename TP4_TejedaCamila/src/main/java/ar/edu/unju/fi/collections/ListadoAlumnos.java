package ar.edu.unju.fi.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.model.Alumno;

public class ListadoAlumnos {
	
	public static List<Alumno> alumnos = new ArrayList<Alumno>();
	public static List<Alumno> alumnosFiltrados = new ArrayList<Alumno>();
	
	public static List<Alumno> listarAlumnos(){
		for (Alumno a: alumnos) {
			if (a.isEstado()==true) {
				alumnosFiltrados.add(a);
			}
		}
		return alumnosFiltrados;
	}
	
	public static Alumno buscarAlumnoPorDni (String dni) {
		for (Alumno a: alumnos) {
			if (a.getDni().equals(dni)){
				return a;
			}
		}
		return null;
	}
	
	public static void agregarAlumno (Alumno a) {
		a.setEstado(true);
		alumnos.add(a);
	}
	
	public static void modificarAlumno(Alumno alumnoModificado) {
		for (int i = 0 ; i < alumnos.size() ; i++) {
			Alumno alumno = alumnos.get(i);
			if (alumno.getDni().equals(alumnoModificado.getDni())) {
				alumnos.set(i, alumnoModificado);
				break;
			}
		}
	}
	
	public static void eliminarAlumno (String dni) {
		for (int i = 0 ; i < alumnos.size() ; i++) {
			Alumno alumno = alumnos.get(i);
			if (alumno.getDni().equals(dni)) {
				alumno.setEstado(false);
				break;
			}
		}
		
	}
}