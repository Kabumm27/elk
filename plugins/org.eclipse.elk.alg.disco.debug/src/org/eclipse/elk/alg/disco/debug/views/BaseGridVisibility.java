/*******************************************************************************
 * Copyright (c) 2017 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.elk.alg.disco.debug.views;

/**
 * Options for various disply options of the base grid in the debug view.
 */
public enum BaseGridVisibility {
    /**
     * {@code HIDDEN} doesn't show any base grid, {@code SIMPLE} shows the grid as
     * empty cells, {@TRAVERSAL} visualizes the traversal order of candidate
     * positions.
     */
    HIDDEN, SIMPLE, TRAVERSAL
}
