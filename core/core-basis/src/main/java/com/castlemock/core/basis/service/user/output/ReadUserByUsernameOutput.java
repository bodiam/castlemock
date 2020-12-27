/*
 * Copyright 2015 Karl Dahlgren
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.castlemock.core.basis.service.user.output;

import com.castlemock.core.basis.model.Output;
import com.castlemock.core.basis.model.user.domain.User;
import com.castlemock.core.basis.service.user.input.ReadUserByUsernameInput;

import java.util.Objects;

/**
 * @author Karl Dahlgren
 * @since 1.0
 * @see ReadUserByUsernameInput
 */
public final class ReadUserByUsernameOutput implements Output {

    private final User user;

    private ReadUserByUsernameOutput(final Builder builder) {
        this.user = Objects.requireNonNull(builder.user);
    }

    public User getUser() {
        return user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {

        private User user;

        private Builder() {
        }

        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public ReadUserByUsernameOutput build() {
            return new ReadUserByUsernameOutput(this);
        }
    }
}