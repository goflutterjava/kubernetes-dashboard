/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.github.shoothzj.kdash.module.chaosmesh;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Chaos<T> {

    @Setter
    @Getter
    public static class Metadata{

        private String name;

        private String namespace;

        public Metadata(){
        }
    }

    private String apiVersion = "chaos-mesh.org/v1alpha1";

    private ChaosKind kind;

    private Metadata metadata;

    private BaseChaosSpec<T> spec;

    public Chaos(ChaosKind kind) {
        this.kind = kind;
    }

    private Chaos() {
    }

}
