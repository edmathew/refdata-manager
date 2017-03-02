package com.ejpm.refdata.manager.vo;

/**
 * POJO representing the generic ref data table structure.
 *
 * @author edgar.mateus
 */
public class RefDataElement {

    private final String id;
    private final String description;
    private final String abbreviation;
    private final Integer ordering;
    private final String foreignId;
    private final String observations;

    public RefDataElement(final String id, final String description, final String abbreviation, final Integer ordering, final String foreignId, final String observations) {
        this.id = id;
        this.description = description;
        this.abbreviation = abbreviation;
        this.ordering = ordering;
        this.foreignId = foreignId;
        this.observations = observations;
    }

    public String getId() {
        return id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getDescription() {
        return description;
    }

    public String getForeignId() {
        return foreignId;
    }

    public String getObservations() {
        return observations;
    }

    public Integer getOrdering() {
        return ordering;
    }

    @Override
    public String toString() {
        return "RefDataEntityElement{"
                + "id='" + id + '\''
                + ", description='" + description + '\''
                + ", abbreviation='" + abbreviation + '\''
                + ", ordering=" + ordering
                + ", fkId='" + foreignId + '\''
                + ", observations='" + observations + '\''
                + '}';
    }

}
