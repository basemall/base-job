package com.base.platform.job.admin.core.route.strategy;

import java.util.List;
import java.util.Random;

import com.base.platform.common.compont.job.biz.model.ReturnT;
import com.base.platform.common.compont.job.biz.model.TriggerParam;
import com.base.platform.job.admin.core.route.ExecutorRouter;

/**
 * Created by xuxueli on 17/3/10.
 */
public class ExecutorRouteRandom extends ExecutorRouter {

    private static Random localRandom = new Random();

    @Override
    public ReturnT<String> route(TriggerParam triggerParam, List<String> addressList) {
        String address = addressList.get(localRandom.nextInt(addressList.size()));
        return new ReturnT<String>(address);
    }

}
