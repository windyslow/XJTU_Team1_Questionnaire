package org.jiaoda.mtappsys_team01.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.jiaoda.mtappsys_team01.entity.questionnaires;

@Mapper
public interface IquestionnairesDao {
    @Insert("insert into questionnaires(questionnaire_id,title,description,creator_id) values(#{questionnaire_id},#{title},#{description},#{creator_id})")
    boolean createquestionnaires(questionnaires questionnaire);
    @Select("select max(questionnaire_id) from questionnaires")
    int getmaxqnid();
}
