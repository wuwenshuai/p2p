package cn.carry.domain;

import java.util.Date;

public class Vedioauth {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vedioauth.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vedioauth.state
     *
     * @mbggenerated
     */
    private Byte state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vedioauth.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vedioauth.auditTime
     *
     * @mbggenerated
     */
    private Date audittime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vedioauth.applyTime
     *
     * @mbggenerated
     */
    private Date applytime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vedioauth.auditor_id
     *
     * @mbggenerated
     */
    private Long auditorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vedioauth.applier_id
     *
     * @mbggenerated
     */
    private Long applierId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vedioauth.id
     *
     * @return the value of vedioauth.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vedioauth.id
     *
     * @param id the value for vedioauth.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vedioauth.state
     *
     * @return the value of vedioauth.state
     *
     * @mbggenerated
     */
    public Byte getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vedioauth.state
     *
     * @param state the value for vedioauth.state
     *
     * @mbggenerated
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vedioauth.remark
     *
     * @return the value of vedioauth.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vedioauth.remark
     *
     * @param remark the value for vedioauth.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vedioauth.auditTime
     *
     * @return the value of vedioauth.auditTime
     *
     * @mbggenerated
     */
    public Date getAudittime() {
        return audittime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vedioauth.auditTime
     *
     * @param audittime the value for vedioauth.auditTime
     *
     * @mbggenerated
     */
    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vedioauth.applyTime
     *
     * @return the value of vedioauth.applyTime
     *
     * @mbggenerated
     */
    public Date getApplytime() {
        return applytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vedioauth.applyTime
     *
     * @param applytime the value for vedioauth.applyTime
     *
     * @mbggenerated
     */
    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vedioauth.auditor_id
     *
     * @return the value of vedioauth.auditor_id
     *
     * @mbggenerated
     */
    public Long getAuditorId() {
        return auditorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vedioauth.auditor_id
     *
     * @param auditorId the value for vedioauth.auditor_id
     *
     * @mbggenerated
     */
    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vedioauth.applier_id
     *
     * @return the value of vedioauth.applier_id
     *
     * @mbggenerated
     */
    public Long getApplierId() {
        return applierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vedioauth.applier_id
     *
     * @param applierId the value for vedioauth.applier_id
     *
     * @mbggenerated
     */
    public void setApplierId(Long applierId) {
        this.applierId = applierId;
    }
}