package com.darumatic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;

/**
 * @author felixschmitz
 * @since 1.0
 */
@Controller
public class K8SecretController
{
    private static final String SECRET_HTML_TEMPLATE = "secret";

    @RequestMapping("/secret")
    public String secret(Model model) {

        File secretDir = new File("/etc/foo");
        String[] list = secretDir.list();
        for (String file : list)
        {
            System.out.println("Found file '" + file + "'");
        }
        return SECRET_HTML_TEMPLATE;
    }
}
