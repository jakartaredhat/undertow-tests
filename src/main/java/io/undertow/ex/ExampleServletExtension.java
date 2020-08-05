package io.undertow.ex;

import io.undertow.servlet.ServletExtension;
import io.undertow.servlet.api.DeploymentInfo;

import jakarta.servlet.ServletContext;

public class ExampleServletExtension implements ServletExtension {

    public static final String INSTALLED = ExampleServletExtension.class.getName() + ".installed";
    public static final String INSTALLED_SERVLET = "servlet-only";
    public static final String INSTALLED_FULL = "full";

    @Override
    public void handleDeployment(DeploymentInfo deploymentInfo, ServletContext servletContext) {
        // Servlet injection...
    }
}
