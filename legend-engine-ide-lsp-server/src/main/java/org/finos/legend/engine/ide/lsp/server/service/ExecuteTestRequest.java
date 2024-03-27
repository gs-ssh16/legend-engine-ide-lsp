/*
 * Copyright 2024 Goldman Sachs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.finos.legend.engine.ide.lsp.server.service;

import java.util.List;
import org.finos.legend.engine.ide.lsp.extension.text.TextLocation;

public class ExecuteTestRequest
{
    private final TextLocation location;
    private final String testId;
    private final List<String> excludedTestIds;

    public ExecuteTestRequest(TextLocation location, String testId, List<String> excludedTestIds)
    {
        this.location = location;
        this.testId = testId;
        this.excludedTestIds = excludedTestIds;
    }

    public TextLocation getLocation()
    {
        return location;
    }

    public String getTestId()
    {
        return testId;
    }

    public List<String> getExcludedTestIds()
    {
        return excludedTestIds;
    }
}
