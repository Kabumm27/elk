/*******************************************************************************
 * Copyright (c) 2011, 2015 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.core;

/**
 * Thrown when a layout algorithm is executed on a graph that is not supported.
 *
 * @author msp
 * @kieler.design 2011-03-14 reviewed by cmot, cds
 * @kieler.rating proposed yellow 2012-07-10 msp
 */
public class UnsupportedGraphException extends RuntimeException {

    /** the serial version UID. */
    private static final long serialVersionUID = 669762537737088914L;
    
    /**
     * Create an unsupported graph exception with no parameters.
     */
    public UnsupportedGraphException() {
        super();
    }
    
    /**
     * Create an unsupported graph exception with a message.
     * 
     * @param message a message
     */
    public UnsupportedGraphException(final String message) {
        super(message);
    }
    
    /**
     * Create an unsupported graph exception with a message and a cause.
     * 
     * @param message a message
     * @param cause a cause
     */
    public UnsupportedGraphException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
