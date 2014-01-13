/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.usergrid.persistence.graph.serialization.impl;


import java.util.UUID;


/**
 *
 * Simple util class to get column timestamps for Astyanax
 */
public class CassUtils {

    /**
     * Get the delete timestamp from a version
     * @param version
     * @return
     */
    public static long getDeleteTimestamp(UUID version){
//     return version.timestamp()+1;
        return version.timestamp();
    }


    /**
     * Get the write timestamp from a version
     * @param version
     * @return
     */
    public static long getWriteTimestamp(UUID version){
        return version.timestamp();
    }
}
