package com.ombillah.ecom4j.webapp.springmvc.viewbean;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.ombillah.ecom4j.domain.BaseDomain;

/**
 * Model object for Catalog page.
 * @author Oussama M Billah.
 *
 */
public class CatalogViewBean extends BaseDomain {

	private static final long serialVersionUID = 1L;
	private Page currentPage;
	private Map<String, Integer> brands;
	private Map<String, Integer> categories;
	private Map<String, Integer> priceRanges;
	private Map<String, String[]> catalogFilters;
	
	public CatalogViewBean() {
		
		Map<String, String[]> filters = new HashMap<String, String[]>();
		String[] all = {"all"};
		filters.put("category", all);
		filters.put("make", all);
		filters.put("price", all);
		this.catalogFilters = filters;
		
	}

	public Page getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Page currentPage) {
		this.currentPage = currentPage;
	}

	public Map<String, Integer> getBrands() {
		return brands;
	}

	public void setBrands(Map<String, Integer> brands) {
		this.brands = brands;
	}
	
	public Map<String, Integer> getCategories() {
		return categories;
	}

	public void setCategories(Map<String, Integer> categories) {
		this.categories = categories;
	}

	public Map<String, Integer> getPriceRanges() {
		return priceRanges;
	}

	public void setPriceRanges(Map<String, Integer> priceRanges) {
		this.priceRanges = priceRanges;
	}

	public Map<String, String[]> getCatalogFilters() {
		return catalogFilters;
	}

	public void setCatalogFilters(Map<String, String[]> catalogFilters) {
		this.catalogFilters = catalogFilters;
	}


	@Override
	public boolean equals(Object object) {
		if (!(object instanceof CatalogViewBean)) {
			return false;
		}

		return EqualsBuilder.reflectionEquals(this, object);
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
