/*******************************************************************************
 * Copyright (c) 2017 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.alg.radial.options;

import org.eclipse.elk.alg.radial.intermediate.overlaps.IOverlapRemoval;
import org.eclipse.elk.alg.radial.intermediate.overlaps.RadiusExtensionOverlapRemoval;

/**
 * The list of strategies for removing overlaps in the graph.
 *
 */
public enum OverlapRemovalStrategy {
    /** Extend the radii until overlap are removed. */
    EXTENT_RADII;

    /**
     * Create the overlap strategy.
     * 
     * @return
     */
    public IOverlapRemoval create() {
        switch (this) {
        case EXTENT_RADII:
            return new RadiusExtensionOverlapRemoval();
        default:
            throw new IllegalArgumentException(
                    "No implementation is available for the layout option " + this.toString());
        }
    }

}