package cn.carry.domain;

public class Systemdictionary {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column systemdictionary.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column systemdictionary.sn
     *
     * @mbggenerated
     */
    private String sn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column systemdictionary.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column systemdictionary.intro
     *
     * @mbggenerated
     */
    private String intro;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column systemdictionary.id
     *
     * @return the value of systemdictionary.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column systemdictionary.id
     *
     * @param id the value for systemdictionary.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column systemdictionary.sn
     *
     * @return the value of systemdictionary.sn
     *
     * @mbggenerated
     */
    public String getSn() {
        return sn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column systemdictionary.sn
     *
     * @param sn the value for systemdictionary.sn
     *
     * @mbggenerated
     */
    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column systemdictionary.title
     *
     * @return the value of systemdictionary.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column systemdictionary.title
     *
     * @param title the value for systemdictionary.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column systemdictionary.intro
     *
     * @return the value of systemdictionary.intro
     *
     * @mbggenerated
     */
    public String getIntro() {
        return intro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column systemdictionary.intro
     *
     * @param intro the value for systemdictionary.intro
     *
     * @mbggenerated
     */
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }
}