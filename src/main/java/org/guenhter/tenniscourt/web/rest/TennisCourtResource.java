package org.guenhter.tenniscourt.web.rest;

import org.guenhter.tenniscourt.domain.TennisCourt;
import org.guenhter.tenniscourt.repository.TennisCourtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TennisCourtResource {

    @Autowired
    private TennisCourtRepository tennisCourtRepository;

    @GetMapping("/tenniscourt")
    public List<TennisCourt> getAllTennisCourts() {
        return Arrays.asList(new TennisCourt(), new TennisCourt(), new TennisCourt());
    }
}
