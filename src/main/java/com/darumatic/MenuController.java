package com.darumatic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @author felixschmitz
 * @since 1.0
 */
@Controller
public class MenuController
{
    private static final String INDEX_HTML_TEMPLATE = "index";

    @RequestMapping("/")
    public String imageSecret(Model model) {

        Map<String, String> environment = System.getenv();

        Map<String, String> vars = new HashMap<String, String>();
        vars.putAll(environment);

        model.addAttribute("variables", vars);

        return INDEX_HTML_TEMPLATE;
    }
}
