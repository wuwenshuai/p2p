package cn.carry.domain;

import java.util.Date;

public class Emailactive {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emailactive.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emailactive.logininfo_id
     *
     * @mbggenerated
     */
    private Long logininfoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emailactive.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emailactive.sendDate
     *
     * @mbggenerated
     */
    private Date senddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column emailactive.uuidcode
     *
     * @mbggenerated
     */
    private String uuidcode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emailactive.id
     *
     * @return the value of emailactive.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emailactive.id
     *
     * @param id the value for emailactive.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emailactive.logininfo_id
     *
     * @return the value of emailactive.logininfo_id
     *
     * @mbggenerated
     */
    public Long getLogininfoId() {
        return logininfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emailactive.logininfo_id
     *
     * @param logininfoId the value for emailactive.logininfo_id
     *
     * @mbggenerated
     */
    public void setLogininfoId(Long logininfoId) {
        this.logininfoId = logininfoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emailactive.email
     *
     * @return the value of emailactive.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emailactive.email
     *
     * @param email the value for emailactive.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emailactive.sendDate
     *
     * @return the value of emailactive.sendDate
     *
     * @mbggenerated
     */
    public Date getSenddate() {
        return senddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emailactive.sendDate
     *
     * @param senddate the value for emailactive.sendDate
     *
     * @mbggenerated
     */
    public void setSenddate(Date senddate) {
        this.senddate = senddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column emailactive.uuidcode
     *
     * @return the value of emailactive.uuidcode
     *
     * @mbggenerated
     */
    public String getUuidcode() {
        return uuidcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column emailactive.uuidcode
     *
     * @param uuidcode the value for emailactive.uuidcode
     *
     * @mbggenerated
     */
    public void setUuidcode(String uuidcode) {
        this.uuidcode = uuidcode == null ? null : uuidcode.trim();
    }
}