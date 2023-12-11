package com.example.emnajemalexamenblanc.RestController;

import com.example.emnajemalexamenblanc.Service.IFourniseurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class VolRestController {
    IFourniseurService iFourniseurService;
}
