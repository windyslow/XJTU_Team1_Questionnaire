package org.jiaoda.mtappsys_team01.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.jiaoda.mtappsys_team01.entity.countresult;
import org.jiaoda.mtappsys_team01.entity.options;
import org.jiaoda.mtappsys_team01.entity.questions;

import java.util.List;

@Mapper
public interface IoptionsDao {
    @Insert("insert into options(question_id,option_content) values(#{question_id},#{option_content})")
    boolean createoption(options option);

    @Select("SELECT Options.question_id, value, counts FROM Options, Questions WHERE Options.question_id = Questions.question_id AND Questions.questionnaire_id = #{questionnaire_id}")
    List <countresult> getcountresult(int questionnaire_id);
}
