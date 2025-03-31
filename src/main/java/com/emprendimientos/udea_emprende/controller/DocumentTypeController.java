package com.emprendimientos.udea_emprende.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprendimientos.udea_emprende.model.DocumentType;
import com.emprendimientos.udea_emprende.service.DocumentTypeService;

@RestController
@RequestMapping("/api/document-types")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class DocumentTypeController {

    @Autowired
    private DocumentTypeService documentTypeService;

    @GetMapping
    public List<DocumentType> getAllDocumentTypes() {
        return documentTypeService.getAllDocumentTypes();
    }

    @PostMapping
    public DocumentType createNewDocumentType(@RequestBody DocumentType newDocumentType) {
        documentTypeService.saveDocumentType(newDocumentType);
        return newDocumentType;
    }

    @GetMapping("/{id}")
    public DocumentType getDocumentTypeById(@PathVariable Integer id) {
        return documentTypeService.getDocumentTypeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDocumentTypeById(@PathVariable Integer id) {
        documentTypeService.deleteDocumentTypeById(id);
    }

}