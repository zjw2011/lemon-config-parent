/*
 * Copyright 2017-2019 Lemonframework Group Holding Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.lemonframework.config;

import java.util.concurrent.ExecutorService;

/**
 * The interface Config change listener.
 *
 * @author jiawei
 * @since 1.0.0
 */
public interface ConfigChangeListener {

    /**
     * Gets executor.
     *
     * @return the executor
     */
    ExecutorService getExecutor();

    /**
     * Receive config info.
     *
     * @param configInfo the config info
     */
    void receiveConfigInfo(final String configInfo);
}
