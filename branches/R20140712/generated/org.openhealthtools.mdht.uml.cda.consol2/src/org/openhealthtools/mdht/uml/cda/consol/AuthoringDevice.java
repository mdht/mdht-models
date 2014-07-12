/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authoring Device</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAuthoringDevice()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ConsolAuthoringDeviceManufacturerModelName ConsolAuthoringDeviceSoftwareName'"
 * @generated
 */
public interface AuthoringDevice extends org.openhealthtools.mdht.uml.cda.AuthoringDevice {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.manufacturerModelName.oclIsUndefined() or self.manufacturerModelName.isNullFlavorUndefined()) implies (not self.manufacturerModelName.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.manufacturerModelName.oclIsUndefined() or self.manufacturerModelName.isNullFlavorUndefined()) implies (not self.manufacturerModelName.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateConsolAuthoringDeviceManufacturerModelName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.softwareName.oclIsUndefined() or self.softwareName.isNullFlavorUndefined()) implies (not self.softwareName.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.softwareName.oclIsUndefined() or self.softwareName.isNullFlavorUndefined()) implies (not self.softwareName.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateConsolAuthoringDeviceSoftwareName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthoringDevice init();
} // AuthoringDevice
