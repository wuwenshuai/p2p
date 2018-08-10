package cn.carry.mapper;

import cn.carry.domain.Companybankinfo;
import cn.carry.domain.CompanybankinfoExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CompanybankinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companybankinfo
     *
     * @mbggenerated
     */
    int countByExample(CompanybankinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companybankinfo
     *
     * @mbggenerated
     */
    int deleteByExample(CompanybankinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companybankinfo
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `companybankinfo`",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companybankinfo
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `companybankinfo` (`id`, `bankname`, ",
        "`accountname`, `banknumber`, ",
        "`bankforkname`)",
        "values (#{id,jdbcType=BIGINT}, #{bankname,jdbcType=VARCHAR}, ",
        "#{accountname,jdbcType=VARCHAR}, #{banknumber,jdbcType=VARCHAR}, ",
        "#{bankforkname,jdbcType=VARCHAR})"
    })
    int insert(Companybankinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companybankinfo
     *
     * @mbggenerated
     */
    int insertSelective(Companybankinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companybankinfo
     *
     * @mbggenerated
     */
    List<Companybankinfo> selectByExample(CompanybankinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companybankinfo
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "`id`, `bankname`, `accountname`, `banknumber`, `bankforkname`",
        "from `companybankinfo`",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    Companybankinfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companybankinfo
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Companybankinfo record, @Param("example") CompanybankinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companybankinfo
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Companybankinfo record, @Param("example") CompanybankinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companybankinfo
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Companybankinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table companybankinfo
     *
     * @mbggenerated
     */
    @Update({
        "update `companybankinfo`",
        "set `bankname` = #{bankname,jdbcType=VARCHAR},",
          "`accountname` = #{accountname,jdbcType=VARCHAR},",
          "`banknumber` = #{banknumber,jdbcType=VARCHAR},",
          "`bankforkname` = #{bankforkname,jdbcType=VARCHAR}",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Companybankinfo record);
}