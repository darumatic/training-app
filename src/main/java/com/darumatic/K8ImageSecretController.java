package com.darumatic;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author felixschmitz
 * @since 1.0
 */
public class K8ImageSecretController
{
    private static final String SECRET_HTML_TEMPLATE = "imagesecret";

    @RequestMapping("/imagesecret")
    public String secret(Model model) {

        return SECRET_HTML_TEMPLATE;
    }
}
