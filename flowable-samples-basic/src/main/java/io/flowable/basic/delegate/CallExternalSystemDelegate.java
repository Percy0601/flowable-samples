package io.flowable.basic.delegate;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

import lombok.extern.slf4j.Slf4j;

/**
 * 2.3.6. 实现JavaDelegate
 *
 * @author: baoxin.zhao
 * @date: 2024/9/22
 */
@Slf4j
public class CallExternalSystemDelegate  implements JavaDelegate {

    public void execute(DelegateExecution execution) {
        log.info("Calling the external system for employee: {}", execution.getVariable("employee"));
    }

}
