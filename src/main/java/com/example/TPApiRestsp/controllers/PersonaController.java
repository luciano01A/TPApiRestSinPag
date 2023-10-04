package com.example.TPApiRestsp.controllers;

import com.example.TPApiRestsp.entities.Persona;
import com.example.TPApiRestsp.sevices.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{
}
