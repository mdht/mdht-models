/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicianofRecordParticipant2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physicianof Record Participant2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PhysicianofRecordParticipant2Impl extends PhysicianofRecordParticipantImpl
		implements PhysicianofRecordParticipant2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicianofRecordParticipant2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipantTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipantTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipantAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipantAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicianofRecordParticipant2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicianofRecordParticipant2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // PhysicianofRecordParticipant2Impl
