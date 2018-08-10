package cn.carry.mapper;

import cn.carry.domain.Emailactive;
import cn.carry.domain.EmailactiveExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface EmailactiveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emailactive
     *
     * @mbggenerated
     */
    int countByExample(EmailactiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emailactive
     *
     * @mbggenerated
     */
    int deleteByExample(EmailactiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emailactive
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `emailactive`",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emailactive
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `emailactive` (`id`, `logininfo_id`, ",
        "`email`, `sendDate`, ",
        "`uuidcode`)",
        "values (#{id,jdbcType=BIGINT}, #{logininfoId,jdbcType=BIGINT}, ",
        "#{email,jdbcType=VARCHAR}, #{senddate,jdbcType=TIMESTAMP}, ",
        "#{uuidcode,jdbcType=VARCHAR})"
    })
    int insert(Emailactive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emailactive
     *
     * @mbggenerated
     */
    int insertSelective(Emailactive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emailactive
     *
     * @mbggenerated
     */
    List<Emailactive> selectByExample(EmailactiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emailactive
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "`id`, `logininfo_id`, `email`, `sendDate`, `uuidcode`",
        "from `emailactive`",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    Emailactive selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emailactive
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Emailactive record, @Param("example") EmailactiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emailactive
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Emailactive record, @Param("example") EmailactiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emailactive
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Emailactive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emailactive
     *
     * @mbggenerated
     */
    @Update({
        "update `emailactive`",
        "set `logininfo_id` = #{logininfoId,jdbcType=BIGINT},",
          "`email` = #{email,jdbcType=VARCHAR},",
          "`sendDate` = #{senddate,jdbcType=TIMESTAMP},",
          "`uuidcode` = #{uuidcode,jdbcType=VARCHAR}",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Emailactive record);
}