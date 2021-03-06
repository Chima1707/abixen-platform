/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.module.chart.util;


import com.abixen.platform.module.chart.model.enumtype.ChartType;
import com.abixen.platform.module.chart.model.impl.ChartConfiguration;
import com.abixen.platform.module.chart.model.impl.DatabaseDataSource;
import com.abixen.platform.module.chart.model.web.DataSetChartWeb;


public interface ChartConfigurationBuilder {

    ChartConfiguration build();

    ChartConfigurationBuilder basic(Long moduleId, ChartType chartType);

    ChartConfigurationBuilder data(DataSetChartWeb dataSetChart, DatabaseDataSource databaseDataSource);

    ChartConfigurationBuilder axis(String axisXName, String axisYName);

}

