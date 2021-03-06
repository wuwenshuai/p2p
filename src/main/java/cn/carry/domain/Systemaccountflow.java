package cn.carry.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Systemaccountflow {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column systemaccountflow.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column systemaccountflow.createdDate
     *
     * @mbggenerated
     */
    private Date createddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column systemaccountflow.accountactiontype
     *
     * @mbggenerated
     */
    private Byte accountactiontype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column systemaccountflow.amount
     *
     * @mbggenerated
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column systemaccountflow.note
     *
     * @mbggenerated
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column systemaccountflow.balance
     *
     * @mbggenerated
     */
    private BigDecimal balance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column systemaccountflow.freezedAmount
     *
     * @mbggenerated
     */
    private BigDecimal freezedamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column systemaccountflow.systemAccount_id
     *
     * @mbggenerated
     */
    private Long systemaccountId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column systemaccountflow.targetuser_id
     *
     * @mbggenerated
     */
    private Long targetuserId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column systemaccountflow.id
     *
     * @return the value of systemaccountflow.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column systemaccountflow.id
     *
     * @param id the value for systemaccountflow.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column systemaccountflow.createdDate
     *
     * @return the value of systemaccountflow.createdDate
     *
     * @mbggenerated
     */
    public Date getCreateddate() {
        return createddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column systemaccountflow.createdDate
     *
     * @param createddate the value for systemaccountflow.createdDate
     *
     * @mbggenerated
     */
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column systemaccountflow.accountactiontype
     *
     * @return the value of systemaccountflow.accountactiontype
     *
     * @mbggenerated
     */
    public Byte getAccountactiontype() {
        return accountactiontype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column systemaccountflow.accountactiontype
     *
     * @param accountactiontype the value for systemaccountflow.accountactiontype
     *
     * @mbggenerated
     */
    public void setAccountactiontype(Byte accountactiontype) {
        this.accountactiontype = accountactiontype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column systemaccountflow.amount
     *
     * @return the value of systemaccountflow.amount
     *
     * @mbggenerated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column systemaccountflow.amount
     *
     * @param amount the value for systemaccountflow.amount
     *
     * @mbggenerated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column systemaccountflow.note
     *
     * @return the value of systemaccountflow.note
     *
     * @mbggenerated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column systemaccountflow.note
     *
     * @param note the value for systemaccountflow.note
     *
     * @mbggenerated
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column systemaccountflow.balance
     *
     * @return the value of systemaccountflow.balance
     *
     * @mbggenerated
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column systemaccountflow.balance
     *
     * @param balance the value for systemaccountflow.balance
     *
     * @mbggenerated
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column systemaccountflow.freezedAmount
     *
     * @return the value of systemaccountflow.freezedAmount
     *
     * @mbggenerated
     */
    public BigDecimal getFreezedamount() {
        return freezedamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column systemaccountflow.freezedAmount
     *
     * @param freezedamount the value for systemaccountflow.freezedAmount
     *
     * @mbggenerated
     */
    public void setFreezedamount(BigDecimal freezedamount) {
        this.freezedamount = freezedamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column systemaccountflow.systemAccount_id
     *
     * @return the value of systemaccountflow.systemAccount_id
     *
     * @mbggenerated
     */
    public Long getSystemaccountId() {
        return systemaccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column systemaccountflow.systemAccount_id
     *
     * @param systemaccountId the value for systemaccountflow.systemAccount_id
     *
     * @mbggenerated
     */
    public void setSystemaccountId(Long systemaccountId) {
        this.systemaccountId = systemaccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column systemaccountflow.targetuser_id
     *
     * @return the value of systemaccountflow.targetuser_id
     *
     * @mbggenerated
     */
    public Long getTargetuserId() {
        return targetuserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column systemaccountflow.targetuser_id
     *
     * @param targetuserId the value for systemaccountflow.targetuser_id
     *
     * @mbggenerated
     */
    public void setTargetuserId(Long targetuserId) {
        this.targetuserId = targetuserId;
    }
}