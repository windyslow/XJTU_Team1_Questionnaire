ALTER TABLE options
    ADD counts int;

-- 向 Users 表中插入一些数据
INSERT INTO Users (username, password, email, phone_number)
VALUES
    ('user1', 'password1', 'user1@example.com', '1234567890'),
    ('user2', 'password2', 'user2@example.com', '0987654321'),
    ('user3', 'password3', 'user3@example.com', '1111111111');

-- 向 Questionnaires 表中插入一些数据
INSERT INTO Questionnaires (title, description, creator_id)
VALUES
    ('调查问卷1', '这是一个关于产品使用情况的调查问卷', 1),
    ('调查问卷2', '这是一个关于客户满意度的调查问卷', 2),
    ('调查问卷3', '这是一个关于学生学习情况的调查问卷', 3);

-- 向 Questions 表中插入一些数据
INSERT INTO Questions (questionnaire_id, question_content, question_type)
VALUES
    (1, '您使用产品的频率是？', 'single_choice'),
    (1, '您使用产品的满意度如何？', 'single_choice'),
    (1, '您使用产品的原因是？', 'multiple_choice'),
    (2, '您对我们的服务满意度如何？', 'single_choice'),
    (2, '您会推荐我们的服务给其他人吗？', 'single_choice'),
    (3, '您每天花在学习上的时间是？', 'single_choice'),
    (3, '您觉得学校的课程设置是否符合实际需求？', 'single_choice');

-- 向 Options 表中插入一些数据
INSERT INTO Options (question_id, option_content, counts)
VALUES
    (1, '每天使用',12),
    (1, '每周使用',34),
    (1, '每月使用',12),
    (2, '非常满意',34),
    (2, '比较满意',11),
    (2, '一般',0),
    (2, '不满意',90),
    (3, '工作需要',23),
    (3, '生活需要',44),
    (3, '兴趣爱好',01),
    (4, '非常满意',12),
    (4, '比较满意',98),
    (4, '一般',1),
    (4, '不满意',2),
    (5, '会',333),
    (5, '不会',909),
    (6, '30分钟以下',808),
    (6, '30分钟到1小时',23),
    (6, '1小时到2小时',344),
    (6, '2小时以上',456),
    (7, '非常符合',555),
    (7, '比较符合',555),
    (7, '一般',22),
    (7, '不符合',11);

-- 向 Responses 表中插入一些数据
INSERT INTO Responses (questionnaire_id, user_id)
VALUES
    (1, 1),
    (1, 2),
    (1, 3),
    (2, 1),
    (2, 3),
    (3, 2),
    (3, 3);

-- 向 Answers 表中插入一些数据
INSERT INTO Answers (response_id, question_id, answer_text, selected_option_id)
VALUES
    (1, 1, NULL, 1),
    (1, 2, NULL, 2),
    (1, 3, NULL, 1),
    (2, 1, NULL, 2),
    (2, 2, NULL, 3),
    (2, 3, NULL, 1),
    (3, 1, NULL, 3),
    (3, 2, NULL, 1),
    (3, 3, NULL, 2),
    (4, 4, NULL, 4),
    (4, 5, NULL, 1),
    (5, 4, NULL, 3),
    (5, 5, NULL, 2),
    (6, 6, NULL, 1),
    (6, 7, NULL, 3),
    (7, 6, NULL, 4),
    (7, 7, NULL, 2);



-- 向 Questions 表中插入两个类型为主观题的元组
INSERT INTO Questions (questionnaire_id, question_content, question_type)
VALUES
    (1, '您对产品的建议和意见是什么？', 'subjective'),
    (2, '您对我们的服务有哪些改进的建议？', 'subjective');

-- 获取新插入的两个问题的 ID
SELECT @q1_id := LAST_INSERT_ID() - 1;
SELECT @q2_id := LAST_INSERT_ID();

-- 向 Answers 表中插入相应的数据
INSERT INTO Answers (response_id, question_id, answer_text, selected_option_id)
VALUES
    (1, @q1_id, '我认为产品的界面可以更加简洁明了，功能可以更加丰富。', NULL),
    (1, @q2_id, '我认为您们可以更加注重客户体验，提供更加完善的售后服务。', NULL),
    (2, @q1_id, '我认为产品的性能可以更加稳定，避免出现卡顿和崩溃。', NULL),
    (2, @q2_id, '我认为您们可以更加注重客户反馈，及时解决客户的问题和疑虑。', NULL);



SELECT counts
FROM Options, Questions
WHERE Options.question_id = Questions.question_id
  AND questionnaire_id = ?
GROUP BY Options.question_id;

SELECT answer_text
FROM Answers, Responses
WHERE Answers.response_id = Responses.response_id
  AND questionnaire_id = ?
GROUP BY question_id;
-----------------------------------------------------
SELECT Options.question_id, value, counts
FROM Options, Questions
WHERE Options.question_id = Questions.question_id
  AND Questions.questionnaire_id = ?;

SELECT Answers.question_id,answer_text
FROM Answers, Responses
WHERE Answers.response_id = Responses.response_id
  AND questionnaire_id = ?
  AND answer_text is not null
ORDER BY question_id;
-------------------------------------------------------
SET @rownum = 0
SELECT @rownum := @rownum+1 AS rownum,