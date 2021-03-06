package cn.carry.domain;

public class Logininfo {


    public static final int STATE_NORMAL = 0;// 正常
    public static final int STATE_LOCK = 1;// 锁定
    public static final int USER_MANAGER = 0;// 后台用户
    public static final int USER_CLIENT = 1;// 前台用户



    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logininfo.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logininfo.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logininfo.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logininfo.state
     *
     * @mbggenerated
     */
    private Byte state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logininfo.usertype
     *
     * @mbggenerated
     */
    private Byte usertype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column logininfo.admin
     *
     * @mbggenerated
     */
    private Boolean admin;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logininfo.id
     *
     * @return the value of logininfo.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logininfo.id
     *
     * @param id the value for logininfo.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logininfo.username
     *
     * @return the value of logininfo.username
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logininfo.username
     *
     * @param username the value for logininfo.username
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logininfo.password
     *
     * @return the value of logininfo.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logininfo.password
     *
     * @param password the value for logininfo.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logininfo.state
     *
     * @return the value of logininfo.state
     *
     * @mbggenerated
     */
    public Byte getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logininfo.state
     *
     * @param state the value for logininfo.state
     *
     * @mbggenerated
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logininfo.usertype
     *
     * @return the value of logininfo.usertype
     *
     * @mbggenerated
     */
    public Byte getUsertype() {
        return usertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logininfo.usertype
     *
     * @param usertype the value for logininfo.usertype
     *
     * @mbggenerated
     */
    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column logininfo.admin
     *
     * @return the value of logininfo.admin
     *
     * @mbggenerated
     */
    public Boolean getAdmin() {
        return admin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column logininfo.admin
     *
     * @param admin the value for logininfo.admin
     *
     * @mbggenerated
     */
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
}