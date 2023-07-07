package org.jiaoda.mtappsys_team01.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.jiaoda.mtappsys_team01.entity.questionnaires;
import org.jiaoda.mtappsys_team01.entity.questions;

@Mapper
public interface IquestionsDao {
    @Insert("insert into questions(question_id,questionnaire_id,question_content,question_type) values(#{question_id},#{questionnaire_id},#{question_content},#{question_type})")
    boolean createquestion(questions question);
    @Select("select max(question_id) from questions")
    int maxquesid();
}
