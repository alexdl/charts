package com.vaadin.addon.charts;

/*
 * #%L
 * Vaadin Charts
 * %%
 * Copyright (C) 2012 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 2.0
 * (CVALv2).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv2 along with this program.
 * If not, see <http://vaadin.com/license/cval-2.0>.
 * #L%
 */

/**
 * Listener interface for legend item click events
 */
public interface LegendItemClickListener {

    /**
     * Called when the user click an item in the chart's legend
     * 
     * @param event
     *            the {@link LegendItemClickEvent} containing the name of the
     *            series which legend item was clicked
     */
    public void onClick(LegendItemClickEvent event);

}
