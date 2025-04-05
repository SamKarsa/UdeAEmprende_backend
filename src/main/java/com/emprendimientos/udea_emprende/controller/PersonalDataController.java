package com.emprendimientos.udea_emprende.controller;

import java.util.ArrayList;
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
import com.emprendimientos.udea_emprende.model.Ethnicity;
import com.emprendimientos.udea_emprende.model.Occupation;
import com.emprendimientos.udea_emprende.model.PersonalData;
import com.emprendimientos.udea_emprende.model.User;
import com.emprendimientos.udea_emprende.model.Vulnerability;
import com.emprendimientos.udea_emprende.service.DocumentTypeService;
import com.emprendimientos.udea_emprende.service.EthnicityService;
import com.emprendimientos.udea_emprende.service.OccupationService;
import com.emprendimientos.udea_emprende.service.PersonalDataService;
import com.emprendimientos.udea_emprende.service.UserService;
import com.emprendimientos.udea_emprende.service.VulnerabilityService;

import getMethodDTO.PersonalDataGetDTO;
import postMethodDTO.PersonalDataPostDTO;

@RestController
@RequestMapping("/api/personal-data")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class PersonalDataController {
    @Autowired
    private PersonalDataService personalDataService;

    @Autowired
    private EthnicityService ethnicityService;

    @Autowired
    private OccupationService occupationService;

    @Autowired
    private DocumentTypeService documentTypeService;

    @Autowired
    private VulnerabilityService vulnerabilityService;

    @Autowired
    private UserService userService;

    @GetMapping
    public List<PersonalDataGetDTO> getAllPersonalData() {
        List<PersonalData> personalDataList = personalDataService.getAllPersonalData();
        List<PersonalDataGetDTO> personalDataDTOList = new ArrayList<>();

        for (PersonalData personalData : personalDataList) {
            PersonalDataGetDTO personalDataGetDTO = new PersonalDataGetDTO();
            personalDataGetDTO.setPersonalDataId(personalData.getPersonalDataId());
            personalDataGetDTO.setFirstName(personalData.getFirstName());
            personalDataGetDTO.setLastNames(personalData.getLastNames());
            personalDataGetDTO.setIdentificationNumber(personalData.getIdentificationNumber());
            personalDataGetDTO.setPhoneNumber(personalData.getPhoneNumber());
            personalDataGetDTO.setDocumentTypeId(personalData.getDocumentType().getDocumentTypeId());
            personalDataGetDTO.setEthnicityId(personalData.getEthnicity().getEthnicityId());
            personalDataGetDTO.setOccupationId(personalData.getOccupation().getOccupationId());
            personalDataGetDTO.setUserId(personalData.getUser().getUserId());
            personalDataGetDTO.setVulnerabilityId(personalData.getVulnerability().getVulnerabilityId());

            personalDataDTOList.add(personalDataGetDTO);
        }
        return personalDataDTOList;
    }

    @PostMapping
    public PersonalDataPostDTO createNewPersonalData(@RequestBody PersonalDataPostDTO personalDataPostDTO) {
        PersonalData newPersonalData = new PersonalData();
        Ethnicity ethnicity = ethnicityService.getEthnicityById(personalDataPostDTO.getEthnicityId());
        Occupation occupation = occupationService.getOccupationById(personalDataPostDTO.getOccupationId());
        DocumentType documentType = documentTypeService.getDocumentTypeById(personalDataPostDTO.getDocumentTypeId());
        Vulnerability vulnerability = vulnerabilityService
                .getVulnerabilityById(personalDataPostDTO.getVulnerabilityId());
        User user = userService.getUserById(personalDataPostDTO.getUserId());

        newPersonalData.setFirstName(personalDataPostDTO.getFirstName());
        newPersonalData.setLastNames(personalDataPostDTO.getLastNames());
        newPersonalData.setIdentificationNumber(personalDataPostDTO.getIdentificationNumber());
        newPersonalData.setPhoneNumber(personalDataPostDTO.getPhoneNumber());

        newPersonalData.setUser(user);
        newPersonalData.setDocumentType(documentType);
        newPersonalData.setEthnicity(ethnicity);
        newPersonalData.setOccupation(occupation);
        newPersonalData.setVulnerability(vulnerability);
        System.out.println("PersonalData: " + newPersonalData.getDocumentType().getDocumentTypeId());

        personalDataService.savePersonalData(newPersonalData);
        return personalDataPostDTO;
    }

    @GetMapping("/{id}")
    public PersonalDataGetDTO getPersonalDataById(@PathVariable Integer id) {
        PersonalData personalData = personalDataService.getPersonalDataById(id);
        PersonalDataGetDTO personalDataGetDTO = new PersonalDataGetDTO();
        personalDataGetDTO.setPersonalDataId(personalData.getPersonalDataId());
        personalDataGetDTO.setFirstName(personalData.getFirstName());
        personalDataGetDTO.setLastNames(personalData.getLastNames());
        personalDataGetDTO.setIdentificationNumber(personalData.getIdentificationNumber());
        personalDataGetDTO.setPhoneNumber(personalData.getPhoneNumber());
        personalDataGetDTO.setDocumentTypeId(personalData.getDocumentType().getDocumentTypeId());
        personalDataGetDTO.setEthnicityId(personalData.getEthnicity().getEthnicityId());
        personalDataGetDTO.setOccupationId(personalData.getOccupation().getOccupationId());
        personalDataGetDTO.setUserId(personalData.getUser().getUserId());
        personalDataGetDTO.setVulnerabilityId(personalData.getVulnerability().getVulnerabilityId());
        return personalDataGetDTO;
    }

    @DeleteMapping("/{id}")
    public void deletePersonalDataById(@PathVariable Integer id) {
        personalDataService.deletePersonalDataById(id);
    }
}
