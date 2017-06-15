package com.darumatic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author felixschmitz
 * @since 1.0
 */
@Controller
public class K8ServiceController
{
    private static final String SERVICE_HTML_TEMPLATE = "service";

    @RequestMapping("/service")
    public String secret(Model model) {

        return SERVICE_HTML_TEMPLATE;
    }
}
