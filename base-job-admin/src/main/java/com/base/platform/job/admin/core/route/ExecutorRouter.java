package com.base.platform.job.admin.core.route;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.base.platform.common.compont.job.biz.model.ReturnT;
import com.base.platform.common.compont.job.biz.model.TriggerParam;

/**
 * Created by xuxueli on 17/3/10.
 */
public abstract class ExecutorRouter {
    protected static Logger logger = LoggerFactory.getLogger(ExecutorRouter.class);

    /**
     * route address
     *
     * @param addressList
     * @return  ReturnT.content=address
     */
    public abstract ReturnT<String> route(TriggerParam triggerParam, List<String> addressList);

}
