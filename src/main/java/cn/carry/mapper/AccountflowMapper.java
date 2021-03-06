package cn.carry.mapper;

import cn.carry.domain.Accountflow;
import cn.carry.domain.AccountflowExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AccountflowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountflow
     *
     * @mbggenerated
     */
    int countByExample(AccountflowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountflow
     *
     * @mbggenerated
     */
    int deleteByExample(AccountflowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountflow
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `accountflow`",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountflow
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `accountflow` (`id`, `accountActionType`, ",
        "`amount`, `note`, `balance`, ",
        "`freezed`, `actionTime`, ",
        "`account_id`)",
        "values (#{id,jdbcType=BIGINT}, #{accountactiontype,jdbcType=TINYINT}, ",
        "#{amount,jdbcType=DECIMAL}, #{note,jdbcType=VARCHAR}, #{balance,jdbcType=DECIMAL}, ",
        "#{freezed,jdbcType=DECIMAL}, #{actiontime,jdbcType=TIMESTAMP}, ",
        "#{accountId,jdbcType=BIGINT})"
    })
    int insert(Accountflow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountflow
     *
     * @mbggenerated
     */
    int insertSelective(Accountflow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountflow
     *
     * @mbggenerated
     */
    List<Accountflow> selectByExample(AccountflowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountflow
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "`id`, `accountActionType`, `amount`, `note`, `balance`, `freezed`, `actionTime`, ",
        "`account_id`",
        "from `accountflow`",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    Accountflow selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountflow
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Accountflow record, @Param("example") AccountflowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountflow
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Accountflow record, @Param("example") AccountflowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountflow
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Accountflow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accountflow
     *
     * @mbggenerated
     */
    @Update({
        "update `accountflow`",
        "set `accountActionType` = #{accountactiontype,jdbcType=TINYINT},",
          "`amount` = #{amount,jdbcType=DECIMAL},",
          "`note` = #{note,jdbcType=VARCHAR},",
          "`balance` = #{balance,jdbcType=DECIMAL},",
          "`freezed` = #{freezed,jdbcType=DECIMAL},",
          "`actionTime` = #{actiontime,jdbcType=TIMESTAMP},",
          "`account_id` = #{accountId,jdbcType=BIGINT}",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Accountflow record);
}