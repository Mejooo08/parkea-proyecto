package co.edu.unbosque.parkea.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mapa")
public class CroquisController {
    /**
     * Este método se usa para msostrar el croquis del mapa para los parqueaderos
     * @return
     */
    @GetMapping("/mapa_de_parqueaderos")
    public String Mapa_de_parqueaderos(){
        return "croquis-client";
    }
}