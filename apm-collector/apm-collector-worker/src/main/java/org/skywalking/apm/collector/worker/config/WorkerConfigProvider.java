package org.skywalking.apm.collector.worker.config;

import org.skywalking.apm.collector.config.ConfigProvider;

/**
 * @author pengys5
 */
public class WorkerConfigProvider implements ConfigProvider {

    @Override
    public Class configClass() {
        return WorkerConfig.class;
    }

    @Override
    public void cliArgs() {
    }
}
