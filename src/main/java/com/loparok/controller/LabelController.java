package com.loparok.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loparok.model.Label;
import com.loparok.service.LabelService;


@RestController
@RequestMapping("/Label")
public class LabelController {
@Autowired
    private LabelService LabelService;

    @PostMapping()
    public Label createLabel(@RequestBody Label entity) throws Exception {

        Label createdLabel = LabelService.createLabel(entity);
        return createdLabel;
    }

    @PutMapping("/{id}")
    public Label updateLabel(@RequestBody Label entity, @PathVariable Long id) throws Exception {

        Label updatedLabel = LabelService.updateLabel(entity, id);
        return updatedLabel;
    }

    @GetMapping()
    public List<Label> getAllLabel() throws Exception {

        List<Label> Labels = LabelService.findAllLabel();
        return Labels;
    }

    @DeleteMapping("/{LabelId}")
    public String deleteLabel(@PathVariable Long LabelId) throws Exception {

        LabelService.deleteLabel(LabelId);
        return "la recette a été supprimé";
    }
}
