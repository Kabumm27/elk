/*******************************************************************************
 * Copyright (c) 2009, 2015 Kiel University and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Kiel University - initial API and implementation
 *******************************************************************************/
package org.eclipse.elk.graph.properties;

/**
 * A proxy object for properties that are resolved lazily.
 *
 * @kieler.rating proposed yellow 2012-11-06 cds
 * @kieler.design 2014-04-17 reviewed by cds, chsch, tit, uru
 * @author msp
 */
public interface IPropertyValueProxy {
    
    /**
     * Resolve the value associated with the given property.
     * 
     * @param <T> property type
     * @param property a property
     * @return the corresponding value, or {@code null} if the value cannot be resolved
     */
    <T> T resolveValue(IProperty<T> property);

}
