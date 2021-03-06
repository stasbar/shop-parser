/*
 * Copyright (c) Stanislaw stasbar Baranski 2017.
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

package com.stasbar.parser.data

import java.util.*


data class Category(val id: Int, val name: String, var products: Set<Product> = HashSet()) : Csvable {

    /**
     * Schema
     * ID , Active(0/1) , Name , Parent category , Root category (0/1) , Description
     */
    override fun getTitle(): List<String> {
        return Arrays.asList<String>("ID", "Active(0/1)", "Name", "Parent category", "Root category (0/1)")
    }

    override fun toCsv(): List<String> {
        return Arrays.asList<String>("$id", "1", name.replace("&nbsp;",""), "Home", "0")
    }
    override val fileNamePrefix = "categories"


}

