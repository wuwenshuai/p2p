package cn.carry.mapper;

import cn.carry.domain.Systemdictionaryitem;
import cn.carry.domain.SystemdictionaryitemExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SystemdictionaryitemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemdictionaryitem
     *
     * @mbggenerated
     */
    int countByExample(SystemdictionaryitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemdictionaryitem
     *
     * @mbggenerated
     */
    int deleteByExample(SystemdictionaryitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemdictionaryitem
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `systemdictionaryitem`",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemdictionaryitem
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `systemdictionaryitem` (`id`, `parentId`, ",
        "`title`, `tvalue`, `sequence`, ",
        "`intro`)",
        "values (#{id,jdbcType=BIGINT}, #{parentid,jdbcType=BIGINT}, ",
        "#{title,jdbcType=VARCHAR}, #{tvalue,jdbcType=VARCHAR}, #{sequence,jdbcType=TINYINT}, ",
        "#{intro,jdbcType=VARCHAR})"
    })
    int insert(Systemdictionaryitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemdictionaryitem
     *
     * @mbggenerated
     */
    int insertSelective(Systemdictionaryitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemdictionaryitem
     *
     * @mbggenerated
     */
    List<Systemdictionaryitem> selectByExample(SystemdictionaryitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemdictionaryitem
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "`id`, `parentId`, `title`, `tvalue`, `sequence`, `intro`",
        "from `systemdictionaryitem`",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    Systemdictionaryitem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemdictionaryitem
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Systemdictionaryitem record, @Param("example") SystemdictionaryitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemdictionaryitem
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Systemdictionaryitem record, @Param("example") SystemdictionaryitemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemdictionaryitem
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Systemdictionaryitem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table systemdictionaryitem
     *
     * @mbggenerated
     */
    @Update({
        "update `systemdictionaryitem`",
        "set `parentId` = #{parentid,jdbcType=BIGINT},",
          "`title` = #{title,jdbcType=VARCHAR},",
          "`tvalue` = #{tvalue,jdbcType=VARCHAR},",
          "`sequence` = #{sequence,jdbcType=TINYINT},",
          "`intro` = #{intro,jdbcType=VARCHAR}",
        "where `id` = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Systemdictionaryitem record);
}