package com.zelei.zojbackendjudgeservice.judge.codesandbox;

import com.zelei.zojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.zelei.zojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
