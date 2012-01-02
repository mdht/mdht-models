/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.CustodianOrganization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assigned Entity Custodian Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAssignedEntity_CustodianOrganization()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='CustodianOrganizationAddr CustodianOrganizationId CustodianOrganizationName CustodianOrganizationTelecom'"
 * @generated
 */
public interface AssignedEntity_CustodianOrganization extends CustodianOrganization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.addr.oclIsUndefined() or self.addr.isNullFlavorUndefined()) implies (not self.addr.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.addr.oclIsUndefined() or self.addr.isNullFlavorUndefined()) implies (not self.addr.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCustodianOrganizationAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
	 * @generated
	 */
	boolean validateCustodianOrganizationId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.name.oclIsUndefined() or self.name.isNullFlavorUndefined()) implies (not self.name.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.name.oclIsUndefined() or self.name.isNullFlavorUndefined()) implies (not self.name.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCustodianOrganizationName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.telecom.oclIsUndefined() or self.telecom.isNullFlavorUndefined()) implies (not self.telecom.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.telecom.oclIsUndefined() or self.telecom.isNullFlavorUndefined()) implies (not self.telecom.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCustodianOrganizationTelecom(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignedEntity_CustodianOrganization init();
} // AssignedEntity_CustodianOrganization
