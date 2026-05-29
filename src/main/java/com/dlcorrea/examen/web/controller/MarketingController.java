/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dlcorrea.examen.web.controller;

import com.dlcorrea.examen.domain.service.EduSmartAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@RestController
public class MarketingController {

    private final EduSmartAIService aiService;

    public MarketingController(EduSmartAIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/edusmart/publicidad")
    public String generatePhrase(
            @RequestParam("tema") String tema,
            @RequestParam("audiencia") String audiencia) {
        
        return this.aiService.generatePhrase(tema, audiencia);
    }
}
