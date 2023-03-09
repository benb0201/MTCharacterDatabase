package com.benson.character;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class CharacterService {

    public CharacterService() {
    }

    public List<Character> getAllCharacters(){
        return List.of(
                new Character("Rudius", "Male", LocalDate.of(2002, Month.JANUARY, 18),
                        "North", "The protagonist. Died at the hands of Truck kun"),
                new Character("Eris", "Female", LocalDate.of(2003, Month.JANUARY, 19),
                        "South", "Part of main cast. Left Rudius")
        );
    }

    public Character getCharacterByID(){
        return null;
    }
}

