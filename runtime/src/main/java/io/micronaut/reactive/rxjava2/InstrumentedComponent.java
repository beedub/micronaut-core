/*
 * Copyright 2017-2019 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.reactive.rxjava2;

import io.micronaut.core.annotation.Internal;
import org.reactivestreams.Subscription;

/**
 * Helper methods for instrumented components.
 *
 * @author graemerocher
 * @since 1.1
 */
@Internal
interface InstrumentedComponent {

    /**
     * Validate the throwable.
     *
     * @param t The throwable
     */
    void onStateError(Throwable t);

    /**
     * Validates the subscriptions.
     *
     * @param upstream     The upstream
     * @param subscription The downstream
     * @return True if they are valid
     */
    boolean validate(Subscription upstream, Subscription subscription);

}
