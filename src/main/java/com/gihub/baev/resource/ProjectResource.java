package com.gihub.baev.resource;

import com.github.baev.entity.Project;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 29.01.16
 */
@Path("project")
@Produces(APPLICATION_JSON)
public class ProjectResource {

    @GET
    public Project getProject() {
        return new Project().withName("SuperProject2000").withUsers("Bob", "Alice");
    }
}
