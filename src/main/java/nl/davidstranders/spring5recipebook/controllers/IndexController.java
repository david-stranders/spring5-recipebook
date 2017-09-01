package nl.davidstranders.spring5recipebook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Dell on 1-9-2017.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(){
        return "index";
    }
}
