/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 06.02.2018 0:42:29
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.core.servicelayer.data;

import java.io.Serializable;

/**
 * POJO representing a sort option.
 */
public  class SortData  implements Serializable 
{

 	/** Default serialVersionUID value. */
 
 	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>SortData.code</code> property defined at extension <code>core</code>. */
		
	private String code;

	/** Direction of sorting. true=ascending, false=descending<br/><br/><i>Generated property</i> for <code>SortData.asc</code> property defined at extension <code>core</code>. */
		
	private boolean asc;
	
	public SortData()
	{
		// default constructor
	}
	
		
	
	public void setCode(final String code)
	{
		this.code = code;
	}

		
	
	public String getCode() 
	{
		return code;
	}
	
		
	
	public void setAsc(final boolean asc)
	{
		this.asc = asc;
	}

		
	
	public boolean isAsc() 
	{
		return asc;
	}
	


}
