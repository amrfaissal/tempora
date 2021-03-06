/* 
 * Copyright 2017 Faissal Elamraoui.
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
package com.github.tempora.analytics;

import java.util.Collection;
import java.util.List;
import java.util.OptionalDouble;

public interface Analytics<T> {

    String getTop5Senders(Collection<T> elements);

    String getTop5TitleTags(Collection<T> elements);

    OptionalDouble getAverageBodySize(Collection<T> elements);

}
