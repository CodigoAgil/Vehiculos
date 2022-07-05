package com.codigoagil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codigoagil.service.VehiculoService;

/**
 * The Class VehiculoController.
 */
@Controller
public class VehiculoController {

	/** The Constant PAGINA_VEHICULOS. */
	private static final String PAGINA_VEHICULOS = "vehiculos";

	/** The vehiculo service. */
	@Autowired
	private VehiculoService vehiculoService;

	/**
	 * View vehiculos page.
	 *
	 * @param model
	 *        the model
	 * @return the string
	 */
	@GetMapping({ "/", "/vehiculos" })
	public String viewVehiculosPage(final Model model) {
		model.addAttribute("listaVehiculos", this.vehiculoService.getAllVehiculos());
		return VehiculoController.PAGINA_VEHICULOS;

	}
}
