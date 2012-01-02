/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.AuthoringDevice;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assigned Author Authoring Device</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAssignedAuthor_AuthoringDevice()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AuthoringDeviceManufacturerModelName AuthoringDeviceSoftwareName'"
 * @generated
 */
public interface AssignedAuthor_AuthoringDevice extends AuthoringDevice {
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
	boolean validateAuthoringDeviceManufacturerModelName(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAuthoringDeviceSoftwareName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedAuthor_AuthoringDevice init();
} // AssignedAuthor_AuthoringDevice
