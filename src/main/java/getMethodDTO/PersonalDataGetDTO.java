package getMethodDTO;

public class PersonalDataGetDTO {
    private Integer personalDataId;
    private String firstName;
    private String lastNames;
    private String identificationNumber;
    private String phoneNumber;
    private Integer documentTypeId;
    private Integer ethnicityId;
    private Integer occupationId;
    private Integer userId;
    private Integer vulnerabilityId;

    public Integer getPersonalDataId() {
        return personalDataId;
    }

    public void setPersonalDataId(Integer personalDataId) {
        this.personalDataId = personalDataId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getDocumentTypeId() {
        return documentTypeId;
    }

    public void setDocumentTypeId(Integer documentTypeId) {
        this.documentTypeId = documentTypeId;
    }

    public Integer getEthnicityId() {
        return ethnicityId;
    }

    public void setEthnicityId(Integer ethnicityId) {
        this.ethnicityId = ethnicityId;
    }

    public Integer getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(Integer occupationId) {
        this.occupationId = occupationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getVulnerabilityId() {
        return vulnerabilityId;
    }

    public void setVulnerabilityId(Integer vulnerabilityId) {
        this.vulnerabilityId = vulnerabilityId;
    }

}
