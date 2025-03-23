package com.emprendimientos.udea_emprende.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprendimientos.udea_emprende.model.DocumentType;
import com.emprendimientos.udea_emprende.service.DocumentTypeService;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/document-types")
public class DocumentTypeController {

    @Autowired
    private DocumentTypeService DocumentTypeService;

    @GetMapping("/listCategories")
    public List<DocumentType> getAllDocumentTypes() {
        return DocumentTypeService.getAllDocumentTypes();
    }

    @PostMapping
    public DocumentType createNewDocumentType(DocumentType newDocumentType) {
        DocumentTypeService.saveDocumentType(newDocumentType);
        return newDocumentType;
    }

    @GetMapping("/{id}")
    public DocumentType getDocumentTypeById(@PathVariable Integer id) {
        return DocumentTypeService.getDocumentTypeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDocumentTypeById(@PathVariable Integer id) {
        DocumentTypeService.deleteDocumentTypeById(id);
    }

}