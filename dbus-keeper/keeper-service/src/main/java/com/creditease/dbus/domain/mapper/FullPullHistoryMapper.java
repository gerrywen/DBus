/*-
 * <<
 * DBus
 * ==
 * Copyright (C) 2016 - 2018 Bridata
 * ==
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
 * >>
 */

package com.creditease.dbus.domain.mapper;

import com.creditease.dbus.domain.model.FullPullHistory;

import java.util.List;
import java.util.Map;

public interface FullPullHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FullPullHistory record);

    FullPullHistory selectByPrimaryKey(Long id);

    List<FullPullHistory> selectAll();

    int updateByPrimaryKey(FullPullHistory record);

    List<FullPullHistory> search(Map<String, Object> param);

    List<Long> searchIdsByUid(int userId);

    List<Map<String,Object>> getDSNames(Map<String, Object> param);

    List<Map<String,Object>> getProjectNames(Map<String, Object> param);

}
