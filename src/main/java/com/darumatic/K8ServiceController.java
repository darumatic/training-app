package com.darumatic;

import io.fabric8.kubernetes.api.model.Service;
import io.fabric8.kubernetes.api.model.ServiceList;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author felixschmitz
 * @since 1.0
 */
@Controller
public class K8ServiceController
{
    private static final String SERVICE_HTML_TEMPLATE = "service";

    @RequestMapping("/service")
    public String service(Model model) {

        KubernetesClient client = new DefaultKubernetesClient();

        ServiceList myServices = client.services().list();

        List<Service> serviceList = myServices.getItems();
        for (Service service : serviceList)
        {
            System.out.println("Found service: " + service.getMetadata().getName());
        }

        return SERVICE_HTML_TEMPLATE;
    }
}
