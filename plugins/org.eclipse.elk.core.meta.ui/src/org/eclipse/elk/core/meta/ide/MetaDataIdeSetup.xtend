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
package org.eclipse.elk.core.meta.ide

import com.google.inject.Guice
import org.eclipse.elk.core.meta.MetaDataRuntimeModule
import org.eclipse.elk.core.meta.MetaDataStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MetaDataIdeSetup extends MetaDataStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MetaDataRuntimeModule, new MetaDataIdeModule))
	}
	
}
