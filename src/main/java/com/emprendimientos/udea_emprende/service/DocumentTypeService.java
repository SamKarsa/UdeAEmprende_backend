package com.emprendimientos.udea_emprende.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emprendimientos.udea_emprende.model.DocumentType;
import com.emprendimientos.udea_emprende.repository.DocumentTypeRepository;

@Service
public class DocumentTypeService {
    private final DocumentTypeRepository documentTypeRepository;

    public DocumentTypeService(DocumentTypeRepository documentTypeRepository) {
        this.documentTypeRepository = documentTypeRepository;
    }

    public List<DocumentType> getAllDocumentTypes() {
        return documentTypeRepository.findAll();
    }

    public DocumentType getDocumentTypeById(Integer documentTypeId) {
        return documentTypeRepository.findById(documentTypeId).orElse(null);
    }

    public DocumentType saveDocumentType(DocumentType documentType) {
        return documentTypeRepository.save(documentType);
    }

    public void deleteDocumentTypeById(Integer documentTypeId) {
        documentTypeRepository.deleteById(documentTypeId);
    }
}
