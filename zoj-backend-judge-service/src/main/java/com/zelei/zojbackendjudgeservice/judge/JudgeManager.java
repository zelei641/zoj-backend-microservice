package com.zelei.zojbackendjudgeservice.judge;

import com.zelei.zojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.zelei.zojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.zelei.zojbackendjudgeservice.judge.strategy.JudgeContext;
import com.zelei.zojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.zelei.zojbackendmodel.model.codesandbox.JudgeInfo;
import com.zelei.zojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
