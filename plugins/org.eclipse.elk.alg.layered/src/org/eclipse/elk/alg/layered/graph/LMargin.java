/*******************************************************************************
 * Copyright (c) 2016 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.alg.layered.graph;

import org.eclipse.elk.core.math.ElkMargin;

/**
 * A mere copycat of {@link ElkMargin}. We use it for a single reason: to make a clear distinction between ELK's
 * margin and the (intermediate) margin used during the execution of ELK Layered.
 * 
 * @see LPadding
 */
public class LMargin extends ElkMargin {
    
    /** The serial version UID. */
    private static final long serialVersionUID = -73916295796649526L;

    /**
     * Creates a new instance with all fields set to {@code 0.0}.
     */
    public LMargin() {
        super();
    }

}
