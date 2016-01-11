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
import org.openhealthtools.mdht.uml.cda.Author;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scanning Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the scanning device and software used to produce the scanned content.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getScanningDevice()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ScanningDeviceTimeEqualsDocumentEffectiveTime ScanningDeviceHasAssignedAuthorId ScanningDeviceHasAssignedAuthoringDeviceCode ScanningDeviceHasDeviceManufacturerModelName ScanningDeviceHasDeviceSoftwareName ScanningDeviceHasAssignedAuthorRepresentedOrganizationId'"
 * @generated
 */
public interface ScanningDevice extends Author {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.time.value = self.getClinicalDocument().effectiveTime.value
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.time.value = self.getClinicalDocument().effectiveTime.value'"
	 * @generated
	 */
	boolean validateScanningDeviceTimeEqualsDocumentEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedAuthor.id->forAll(ident : datatypes::II | not ident.root.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor.id->forAll(ident : datatypes::II | not ident.root.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateScanningDeviceHasAssignedAuthorId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedAuthor.assignedAuthoringDevice.code.codeSystem = '1.2.840.10008.2.16.4'
	 *    and not self.assignedAuthor.assignedAuthoringDevice.code.code.oclIsUndefined()
	 *    and not self.assignedAuthor.assignedAuthoringDevice.code.displayName.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor.assignedAuthoringDevice.code.codeSystem = \'1.2.840.10008.2.16.4\'\n   and not self.assignedAuthor.assignedAuthoringDevice.code.code.oclIsUndefined()\n   and not self.assignedAuthor.assignedAuthoringDevice.code.displayName.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateScanningDeviceHasAssignedAuthoringDeviceCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.assignedAuthor.assignedAuthoringDevice.manufacturerModelName.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.assignedAuthor.assignedAuthoringDevice.manufacturerModelName.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateScanningDeviceHasDeviceManufacturerModelName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.assignedAuthor.assignedAuthoringDevice.softwareName.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.assignedAuthor.assignedAuthoringDevice.softwareName.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateScanningDeviceHasDeviceSoftwareName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedAuthor.representedOrganization.id->forAll(ident : datatypes::II | not ident.root.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedAuthor.representedOrganization.id->forAll(ident : datatypes::II | not ident.root.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanningDevice init();
} // ScanningDevice
