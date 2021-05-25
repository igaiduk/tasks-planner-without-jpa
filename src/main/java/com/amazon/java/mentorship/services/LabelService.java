package com.amazon.java.mentorship.services;

import com.amazon.java.mentorship.entities.Label;
import com.amazon.java.mentorship.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class LabelService {

    private final static List<Label> LABELS = new ArrayList<>();

    public void addLabel(Label label)
    {
      LABELS.add(label);
    }

    public void deleteLabel(Label label)
    {
        LABELS.remove(label);
    }

    public List<Label> getAllLabels()
    {
        return LABELS;
    }

    public List<Label> getAllLabelsByOwner(User owner)
    {
        return LABELS.stream().filter(l -> l.getOwner().equals(owner)).collect(Collectors.toList());
    }
}
