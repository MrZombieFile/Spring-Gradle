package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n02.S04T01N02Adria.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String greeting(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom){
        return "Hola, " + nom + ". Estàs executant un projecte Gradle";
    }

    @GetMapping({"/HelloWorld2/", "/HelloWorld2/{nom}"})
    @ResponseBody
    public String greeting2(@PathVariable(required = false) String nom){
        if (nom == null)
            nom = "UNKNOWN";
        return "Hola, " + nom + ". Estàs executant un projecte Gradle";
    }

}
