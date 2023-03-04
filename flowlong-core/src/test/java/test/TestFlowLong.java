/* Copyright 2023-2025 jobob@qq.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test;

import com.flowlong.bpm.engine.FlowLongEngine;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 测试流程引擎抽象类
 */
public abstract class TestFlowLong {

    @Autowired
    protected FlowLongEngine flowLongEngine;

    protected Long deployByResource(String resourceName) {
        return flowLongEngine.processService().deployByResource(resourceName, false);
    }
}
