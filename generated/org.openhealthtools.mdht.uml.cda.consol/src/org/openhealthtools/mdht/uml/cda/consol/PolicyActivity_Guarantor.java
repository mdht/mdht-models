/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Performer2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Policy Activity Guarantor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPolicyActivity_Guarantor()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GuarantorTime GuarantorGuarantorAssignedEntity' constraints.validation.warning='GuarantorGuarantorAssignedEntityCode GuarantorGuarantorAssignedEntityAddr GuarantorGuarantorAssignedEntityTelecom'"
 * @generated
 */
public interface PolicyActivity_Guarantor extends Performer2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateGuarantorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))'"
	 * @generated
	 */
	boolean validateGuarantorGuarantorAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.assignedEntity->exists(not oclIsUndefined()) then self.assignedEntity->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in (
	 * value.code = 'GUAR' and value.codeSystem = '2.16.840.1.113883.5.111'))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.assignedEntity->exists(not oclIsUndefined()) then self.assignedEntity->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in (\r\nvalue.code = \'GUAR\' and value.codeSystem = \'2.16.840.1.113883.5.111\'))) else true endif'"
	 * @generated
	 */
	boolean validateGuarantorGuarantorAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.assignedEntity->exists(not oclIsUndefined()) then self.assignedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.assignedEntity->exists(not oclIsUndefined()) then self.assignedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGuarantorGuarantorAssignedEntityAddr(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.assignedEntity->exists(not oclIsUndefined()) then self.assignedEntity->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.assignedEntity->exists(not oclIsUndefined()) then self.assignedEntity->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGuarantorGuarantorAssignedEntityTelecom(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity_Guarantor init();
} // PolicyActivity_Guarantor
