/*
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.worldline.graphql.dynaql.api.core;

import com.worldline.graphql.dynaql.api.core.exceptions.StaticFactoryMethodUsedFromInterfaceException;

import java.util.List;

import static java.util.Arrays.asList;

public interface Variable extends Buildable {

    /*
        Static factory methods
    */
    @SafeVarargs
    static List<Variable> vars(Variable... vars) {
        return asList(vars);
    }

    // (name, scalarType)
    static Variable var(String name, ScalarType scalarType) {
        throw new StaticFactoryMethodUsedFromInterfaceException(new Throwable().getStackTrace());
    }

    // (name, scalarType, defaultValue)
    static Variable var(String name, ScalarType scalarType, Object defaultValue) {
        throw new StaticFactoryMethodUsedFromInterfaceException(new Throwable().getStackTrace());
    }

    // (name, objectType)
    static Variable var(String name, String objectType) {
        throw new StaticFactoryMethodUsedFromInterfaceException(new Throwable().getStackTrace());
    }

    // (name, objectType, defaultValue)
    static Variable var(String name, String objectType, Object defaultValue) {
        throw new StaticFactoryMethodUsedFromInterfaceException(new Throwable().getStackTrace());
    }

    // (name, VariableType)
    static Variable var(String name, VariableType type) {
        throw new StaticFactoryMethodUsedFromInterfaceException(new Throwable().getStackTrace());
    }

    // (name, VariableType, defaultValue)
    static Variable var(String name, VariableType type, Object defaultValue) {
        throw new StaticFactoryMethodUsedFromInterfaceException(new Throwable().getStackTrace());
    }

    /*
        Getter/Setter
    */
    String getName();

    void setName(String name);

    VariableType getType();

    void setType(VariableType value);

    Object getDefaultValue();

    void setDefaultValue(Object value);
}
