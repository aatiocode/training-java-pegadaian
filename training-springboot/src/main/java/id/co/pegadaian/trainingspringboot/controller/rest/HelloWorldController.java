package id.co.pegadaian.trainingspringboot.controller.rest;

import id.co.pegadaian.trainingspringboot.entity.Nasabah;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @RequestMapping (method = RequestMethod.GET, value = "/hello") 
    public String salam(){
        return "Selamat Datang wooy.. !!!";
    }
    
    @GetMapping ("/getNasabah")
    public Nasabah getNasabah() {
        Nasabah nasabah = new Nasabah();
        
        nasabah.setId("117");
        nasabah.setNama("Hanggoro Doso");
        nasabah.setAlamat("Bantul");
        
        return nasabah;
    }
}
