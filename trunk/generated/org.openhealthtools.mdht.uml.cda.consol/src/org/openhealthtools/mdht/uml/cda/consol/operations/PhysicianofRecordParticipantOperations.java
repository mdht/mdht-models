/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.hl7.rim.operations.ParticipationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physicianof Record Participant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicianofRecordParticipantOperations extends ParticipationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicianofRecordParticipantOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantTemplateId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantTemplateId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.2')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantTemplateId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantTemplateId(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.2')
	 * @param physicianofRecordParticipant The receiving '<em><b>Physicianof Record Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicianofRecordParticipantTemplateId(
			PhysicianofRecordParticipant physicianofRecordParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT);
			try {
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicianofRecordParticipant)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT__PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("PhysicianofRecordParticipantTemplateId"),
					new Object[] { physicianofRecordParticipant }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantTypeCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantTypeCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeCode=vocab::x_EncounterParticipant::ATND";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantTypeCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantTypeCode(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeCode=vocab::x_EncounterParticipant::ATND
	 * @param physicianofRecordParticipant The receiving '<em><b>Physicianof Record Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicianofRecordParticipantTypeCode(
			PhysicianofRecordParticipant physicianofRecordParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT);
			try {
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicianofRecordParticipant)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT__PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE,
					ConsolPlugin.INSTANCE.getString("PhysicianofRecordParticipantTypeCode"),
					new Object[] { physicianofRecordParticipant }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicianofRecordParticipantAssignedEntity(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntity(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicianofRecordParticipantAssignedEntity(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicianofRecordParticipantAssignedEntity(PhysicianofRecordParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))
	 * @param physicianofRecordParticipant The receiving '<em><b>Physicianof Record Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicianofRecordParticipantAssignedEntity(
			PhysicianofRecordParticipant physicianofRecordParticipant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PHYSICIANOF_RECORD_PARTICIPANT);
			try {
				VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicianofRecordParticipant)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PHYSICIANOF_RECORD_PARTICIPANT__PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY,
					ConsolPlugin.INSTANCE.getString("PhysicianofRecordParticipantAssignedEntity"),
					new Object[] { physicianofRecordParticipant }));
			}
			return false;
		}
		return true;
	}

} // PhysicianofRecordParticipantOperations
