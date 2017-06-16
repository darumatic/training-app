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
    private static final String SECRETS_PATH = "/etc/foo";

    @RequestMapping("/secret")
    public String secret(Model model) {

        File secretDir = new File(SECRETS_PATH);
        String[] list = secretDir.list();
        for (String file : list)
        {
            File secretsFile = new File(SECRETS_PATH + File.separator + file);
            if (secretsFile.exists())
            {
                System.out.println("Found file '" + file + "'");
            }
        }
        return SECRET_HTML_TEMPLATE;
    }
}
