//
//package com.porfolio.luvidev.Security.util;
//
//import com.porfolio.luvidev.Security.Entity.Rol;
//import com.porfolio.luvidev.Security.Enums.RolNombre;
//import com.porfolio.luvidev.Security.Service.RolService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
///**
// *
// * @author lucho
// * Esta Clase solo se puede ejecutar una vez, luego hay que eliminarla o comentarla. genera en la base de datos los roles
// */
//@Component
//public class CreateRoles implements CommandLineRunner{
//    
//    @Autowired
//    RolService rolService;
//    
//    
//    @Override
//    public void run(String... args) throws Exception {
//        Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
//        Rol rolUser = new Rol(RolNombre.ROLE_USER);
//        rolService.save(rolAdmin);
//        rolService.save(rolUser);
//    }
//    
//    
//    
//}
