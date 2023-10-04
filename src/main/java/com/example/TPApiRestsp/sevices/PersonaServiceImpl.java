package com.example.TPApiRestsp.sevices;

import com.example.TPApiRestsp.entities.Persona;
import com.example.TPApiRestsp.repositories.BaseRepository;
import com.example.TPApiRestsp.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;
    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }
}