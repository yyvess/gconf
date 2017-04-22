/**
 * Copyright 2015 Yves Galante
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.jmob.guice.conf.core.samples.advenced.service;


import net.jmob.guice.conf.core.BindConfig;
import net.jmob.guice.conf.core.InjectConfig;

import static net.jmob.guice.conf.core.Syntax.JSON;

@BindConfig(value = "net/jmob/guice/conf/core/samples/sample_02", syntax = JSON)
public class ServiceJson implements Service {

    @InjectConfig
    private int port;

    @InjectConfig("complexType")
    private TypedEntry config;

    @Override
    public int getPort() {
        return port;
    }

    @Override
    public TypedEntry getConfig() {
        return config;
    }
}
