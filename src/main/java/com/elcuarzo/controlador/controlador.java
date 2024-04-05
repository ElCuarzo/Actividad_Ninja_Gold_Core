package com.elcuarzo.controlador;

import java.util.Date;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.elcuarzo.modelo.RegistroActividad;

@Controller
public class controlador {
	private int oro = 0;
	private List<RegistroActividad> registroActividades = new ArrayList<>();
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("oro", oro);
        model.addAttribute("registroActividades", registroActividades);

        return "index.jsp";
	}
	
	@PostMapping("/")
	public String index(@RequestParam(value="granja", required=false) String granja,
						@RequestParam(value="cueva", required=false) String cueva,
						@RequestParam(value="casa", required=false) String casa,
						@RequestParam(value="casino", required=false) String casino){
		if(granja != null) {
			Random random = new Random();
			int oroGanado = random.nextInt(11) + 10;
			RegistroActividad registro = new RegistroActividad("Granja", oroGanado, new Date());
			registroActividades.add(registro);
			oro += oroGanado;
		}
		else if(cueva != null) {
			Random random = new Random();
			int oroGanado = random.nextInt(6) + 5;
			RegistroActividad registro = new RegistroActividad("Cueva", oroGanado, new Date());
			registroActividades.add(registro);
			oro += oroGanado;
		}
		else if(casa != null) {
			Random random = new Random();
			int oroGanado = random.nextInt(4) + 2;
			RegistroActividad registro = new RegistroActividad("Casa", oroGanado, new Date());
			registroActividades.add(registro);
			oro += oroGanado;
		}
		else if(casino != null) {
			Random random = new Random();
			int probabilidad = random.nextInt(2);
			if(probabilidad == 1) {
				int oroGanado = random.nextInt(51);
				RegistroActividad registro = new RegistroActividad("Casino", oroGanado, new Date());
				registroActividades.add(registro);
				oro += oroGanado;
			}
			else if(probabilidad == 0) {
				int oroGanado = -(random.nextInt(51));
				RegistroActividad registro = new RegistroActividad("Casino", oroGanado, new Date());
				registroActividades.add(registro);
				oro += oroGanado;
			}
		}
		
		return "redirect:/";
	}
}
