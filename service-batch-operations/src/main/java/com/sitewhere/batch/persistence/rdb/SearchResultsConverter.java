/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.batch.persistence.rdb;

import com.sitewhere.spi.search.ISearchResults;

import java.util.List;

/**
 * @param <T>
 *
 * Simeon Chen
 */
public class SearchResultsConverter<T> {

    public ISearchResults<T> convert(List<T> list, long totalElements) {
	return new ISearchResults<T> () {

	    @Override
	    public long getNumResults() {
		return totalElements;
	    }

	    @Override
	    public List<T> getResults() {
		return list;
	    }
	};
    }

}