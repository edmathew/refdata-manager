package com.ejpm.refdata.persistence.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "refdata_dict", schema = "ref_data")
public class RefDataDictionaryDTO implements Serializable {

    private String id;
    private String entityName;
    private String pkTable;
    private String fkTable;
    private Integer ordering;

    private Integer canAdd;
    private Integer canEdit;
    private Integer canDelete;
    private Integer canEditFk;

    private String obsTitle;

    @Id
    @Column(name = "id", unique = true, nullable = false)
    public String getId() {
        return id;
    }

    @Column(name = "descr")
    public String getEntityName() {
        return entityName;
    }

    @Column(name = "pk_table")
    public String getPkTable() {
        return pkTable;
    }

    @Column(name = "fk_table")
    public String getFkTable() {
        return fkTable;
    }

    @Column(name = "ordering")
    public Integer getOrdering() {
        return ordering;
    }

    @Column(name = "can_add")
    public Integer getCanAdd() {
        return canAdd;
    }

    @Column(name = "can_edit")
    public Integer getCanEdit() {
        return canEdit;
    }

    @Column(name = "can_delete")
    public Integer getCanDelete() {
        return canDelete;
    }

    @Column(name = "can_edit_fk")
    public Integer getCanEditFk() {
        return canEditFk;
    }

    @Column(name = "obs_title")
    public String getObsTitle() {
        return obsTitle;
    }

    public void setCanAdd(Integer canAdd) {
        this.canAdd = canAdd;
    }

    public void setCanEdit(Integer canEdit) {
        this.canEdit = canEdit;
    }

    public void setCanDelete(Integer canDelete) {
        this.canDelete = canDelete;
    }

    public void setCanEditFk(Integer canEditFk) {
        this.canEditFk = canEditFk;
    }

    public void setObsTitle(String obsTitle) {
        this.obsTitle = obsTitle;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public void setPkTable(String pkTable) {
        this.pkTable = pkTable;
    }

    public void setFkTable(String fkTable) {
        this.fkTable = fkTable;
    }

    public void setOrdering(Integer ordering) {
        this.ordering = ordering;
    }

    @Override
    public String toString() {
        return "RefDataDictionaryDTO{"
                + "id='" + id + '\''
                + ", entityName='" + entityName + '\''
                + ", pkTable='" + pkTable + '\''
                + ", fkTable='" + fkTable + '\''
                + ", ordering=" + ordering
                + ", canAdd=" + canAdd
                + ", canEdit=" + canEdit
                + ", canDelete=" + canDelete
                + ", canEditFk=" + canEditFk
                + ", obsTitle='" + obsTitle + '\''
                + '}';
    }
}
