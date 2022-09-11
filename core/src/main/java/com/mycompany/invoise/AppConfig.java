package com.mycompany.invoise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.mycompany.invoise.repository.database","com.mycompany.invoise.service.prefix","com.mycompany.invoise.controller.web"})
//@PropertySource("classpath:application.properties")                       // Je pourrai le supprimer si je decide que mon application.proprties est contenu dans  applicationContext.xml
//@ImportResource("classpath:applicationContext.xml")                      // Cette annotation permet de dire que je garde le fichier applicationContext.xml
public class AppConfig {
}
