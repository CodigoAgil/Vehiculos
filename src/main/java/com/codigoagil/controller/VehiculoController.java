package com.codigoagil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codigoagil.service.VehiculoService;


@Controller
public class VehiculoController {

	private static final String PAGINA_VEHICULOS = "vehiculos";
	
	@Autowired
	private VehiculoService vehiculoService;
	
	@GetMapping({"/","/vehiculos"})
	public String viewTipoUsuarioPage (final Model model) {
		model.addAttribute("listaVehiculos",this.vehiculoService.getAllVehiculos());
		return VehiculoController.PAGINA_VEHICULOS;

	}
}
