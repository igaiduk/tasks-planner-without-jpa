package com.amazon.java.mentorship.api;

import com.amazon.java.mentorship.entities.Label;
import com.amazon.java.mentorship.entities.User;

import javax.management.Notification;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/labels")
public class LabelsAPI {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Label> getAll() {
        List<Label> labels = new ArrayList<>();
        labels.add(new Label("test", new User("test", "test")));

    return labels;
    }
}
