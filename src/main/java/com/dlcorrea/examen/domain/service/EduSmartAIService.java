/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dlcorrea.examen.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.V;
/**
 *
 * @author Usuario
 */
@AiService
public interface EduSmartAIService {
    @UserMessage("""
        Redacta una frase publicitaria de máximo 100 caracteres para vender un curso de {{tema}} dirigido a {{audiencia}}.
    """)
    String generatePhrase(@V("tema") String tema, @V("audiencia") String audiencia);
}
