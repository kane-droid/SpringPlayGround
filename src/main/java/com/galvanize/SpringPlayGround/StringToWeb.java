package com.galvanize.SpringPlayGround;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringToWeb {
    @GetMapping("/")
    public String Welcome(){
        return """
                 Welcome to my playground, please watch where you step. There's a lot of holes here.
                 don't fret, for I know the path...sometimes
                """ ;
    }

}
