package com.base.platform.job.admin.core.route.strategy;

import java.util.List;

import com.base.platform.common.compont.job.biz.model.ReturnT;
import com.base.platform.common.compont.job.biz.model.TriggerParam;
import com.base.platform.job.admin.core.route.ExecutorRouter;

/**
 * Created by xuxueli on 17/3/10.
 */
public class ExecutorRouteLast extends ExecutorRouter {

    @Override
    public ReturnT<String> route(TriggerParam triggerParam, List<String> addressList) {
        return new ReturnT<String>(addressList.get(addressList.size()-1));
    }

}
