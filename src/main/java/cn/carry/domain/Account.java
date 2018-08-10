package cn.carry.domain;

import java.math.BigDecimal;

public class Account {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.tradePassword
     *
     * @mbggenerated
     */
    private String tradepassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.usableAmount
     *
     * @mbggenerated
     */
    private BigDecimal usableamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.freezedAmount
     *
     * @mbggenerated
     */
    private BigDecimal freezedamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.borrowLimitAmount
     *
     * @mbggenerated
     */
    private BigDecimal borrowlimitamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.version
     *
     * @mbggenerated
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.unReceiveInterest
     *
     * @mbggenerated
     */
    private BigDecimal unreceiveinterest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.unReceivePrincipal
     *
     * @mbggenerated
     */
    private BigDecimal unreceiveprincipal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.unReturnAmount
     *
     * @mbggenerated
     */
    private BigDecimal unreturnamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account.remainBorrowLimit
     *
     * @mbggenerated
     */
    private BigDecimal remainborrowlimit;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.id
     *
     * @return the value of account.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.id
     *
     * @param id the value for account.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.tradePassword
     *
     * @return the value of account.tradePassword
     *
     * @mbggenerated
     */
    public String getTradepassword() {
        return tradepassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.tradePassword
     *
     * @param tradepassword the value for account.tradePassword
     *
     * @mbggenerated
     */
    public void setTradepassword(String tradepassword) {
        this.tradepassword = tradepassword == null ? null : tradepassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.usableAmount
     *
     * @return the value of account.usableAmount
     *
     * @mbggenerated
     */
    public BigDecimal getUsableamount() {
        return usableamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.usableAmount
     *
     * @param usableamount the value for account.usableAmount
     *
     * @mbggenerated
     */
    public void setUsableamount(BigDecimal usableamount) {
        this.usableamount = usableamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.freezedAmount
     *
     * @return the value of account.freezedAmount
     *
     * @mbggenerated
     */
    public BigDecimal getFreezedamount() {
        return freezedamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.freezedAmount
     *
     * @param freezedamount the value for account.freezedAmount
     *
     * @mbggenerated
     */
    public void setFreezedamount(BigDecimal freezedamount) {
        this.freezedamount = freezedamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.borrowLimitAmount
     *
     * @return the value of account.borrowLimitAmount
     *
     * @mbggenerated
     */
    public BigDecimal getBorrowlimitamount() {
        return borrowlimitamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.borrowLimitAmount
     *
     * @param borrowlimitamount the value for account.borrowLimitAmount
     *
     * @mbggenerated
     */
    public void setBorrowlimitamount(BigDecimal borrowlimitamount) {
        this.borrowlimitamount = borrowlimitamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.version
     *
     * @return the value of account.version
     *
     * @mbggenerated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.version
     *
     * @param version the value for account.version
     *
     * @mbggenerated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.unReceiveInterest
     *
     * @return the value of account.unReceiveInterest
     *
     * @mbggenerated
     */
    public BigDecimal getUnreceiveinterest() {
        return unreceiveinterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.unReceiveInterest
     *
     * @param unreceiveinterest the value for account.unReceiveInterest
     *
     * @mbggenerated
     */
    public void setUnreceiveinterest(BigDecimal unreceiveinterest) {
        this.unreceiveinterest = unreceiveinterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.unReceivePrincipal
     *
     * @return the value of account.unReceivePrincipal
     *
     * @mbggenerated
     */
    public BigDecimal getUnreceiveprincipal() {
        return unreceiveprincipal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.unReceivePrincipal
     *
     * @param unreceiveprincipal the value for account.unReceivePrincipal
     *
     * @mbggenerated
     */
    public void setUnreceiveprincipal(BigDecimal unreceiveprincipal) {
        this.unreceiveprincipal = unreceiveprincipal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.unReturnAmount
     *
     * @return the value of account.unReturnAmount
     *
     * @mbggenerated
     */
    public BigDecimal getUnreturnamount() {
        return unreturnamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.unReturnAmount
     *
     * @param unreturnamount the value for account.unReturnAmount
     *
     * @mbggenerated
     */
    public void setUnreturnamount(BigDecimal unreturnamount) {
        this.unreturnamount = unreturnamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account.remainBorrowLimit
     *
     * @return the value of account.remainBorrowLimit
     *
     * @mbggenerated
     */
    public BigDecimal getRemainborrowlimit() {
        return remainborrowlimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account.remainBorrowLimit
     *
     * @param remainborrowlimit the value for account.remainBorrowLimit
     *
     * @mbggenerated
     */
    public void setRemainborrowlimit(BigDecimal remainborrowlimit) {
        this.remainborrowlimit = remainborrowlimit;
    }
}