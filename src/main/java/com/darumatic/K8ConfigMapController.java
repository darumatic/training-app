package com.darumatic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author felixschmitz
 * @since 1.0
 */
@Controller
public class K8ConfigMapController
{
    private static final String CONFIG_MAP_HTML_TEMPLATE = "configmap";

    @RequestMapping("/configMap")
    public String greeting(Model model) {
        return CONFIG_MAP_HTML_TEMPLATE;
    }
}
